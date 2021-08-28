package client;

import gui.Response;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.LinkedList;

public class ClientHandler extends ChannelInboundHandlerAdapter {
    private Response response;
    private String request;
    private String loc;

    public ClientHandler(Response response, String request, String loc) {
        this.response = response;
        this.request = request;
        this.loc = loc;
    }

    @Override
    public void channelActive(ChannelHandlerContext ctx)
            throws Exception {
        RequestData msg = new RequestData();
        msg.setStringValue(request);
        ChannelFuture future = ctx.writeAndFlush(msg);
    }

    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg)
            throws Exception {
        ResponseData data = (ResponseData) msg;
        for(int i = 0; i < data.getSize(); i++){
            if(data.getItem(i).getItem().getClass().equals(byte[].class)){
                String files = "";
                for (String name : data.getItem(i).getFilenames()){
                    files += name + "_";
                }
                files = files.substring(0, files.length()-1);
                String extension = data.getItem(i).getExtension();
                File file = new File(loc + files + "." +  extension);
                int q = 1;
                String resFileName = files + "." +  extension;
                while (file.exists()){
                    file = new File(loc + files + "_" + q + "." +  extension);
                    resFileName = files + "_" + q + "." + extension;
                    q++;
                }
                try(OutputStream outStream = new FileOutputStream(file)){
                    outStream.write((byte[])data.getItem(i).getItem());
                }catch (Exception e){
                    throw new Exception(e.getMessage());
                }
                response.addAnswer(resFileName);
                response.addIsImage(extension.equals("png") || extension.equals("jpg"));
            } else {
                response.addAnswer(data.getItem(i).getItem().toString());
                response.addIsImage(false);
            }
            LinkedList<String> covs = new LinkedList<>();
            for (String name: data.getItem(i).getFilenames()) {
                covs.add(name);
            }
            response.addCoverages(covs);
        }
        response.setGot(true);
        ctx.close();
    }
}