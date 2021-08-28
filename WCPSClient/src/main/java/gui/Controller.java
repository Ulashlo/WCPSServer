package gui;

import client.ClientHandler;
import client.RequestDataEncoder;
import client.ResponseDataDecoder;
import io.netty.bootstrap.Bootstrap;
import io.netty.channel.*;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioSocketChannel;

public class Controller {
    private String host;
    private final int port = 2345;
    private String request;
    private String loc;

    public Controller(String host, String request, String loc) {
        this.host = host;
        this.request = request;
        this.loc = loc;
    }

    public Response sendRequest(Response response) throws InterruptedException {
        EventLoopGroup workerGroup = new NioEventLoopGroup(1);
        try {
            Bootstrap b = new Bootstrap();
            b.group(workerGroup);
            b.channel(NioSocketChannel.class);
            b.option(ChannelOption.SO_KEEPALIVE, true);
            b.handler(new ChannelInitializer<SocketChannel>() {
                @Override
                public void initChannel(SocketChannel ch)
                        throws Exception {
                    ch.pipeline().addLast(new RequestDataEncoder(),
                            new ResponseDataDecoder(),
                            new ClientHandler(response, request, loc));
                }
            });

            ChannelFuture f = b.connect(host, port).sync();

            f.channel().closeFuture().sync();
        } catch (Exception ex){
            throw new InterruptedException(ex.getMessage());
        }finally {
            workerGroup.shutdownGracefully();
        }
        return response;
    }
}
