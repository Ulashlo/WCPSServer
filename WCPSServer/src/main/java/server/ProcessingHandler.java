package server;

import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelFutureListener;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import translator.Coverage;
import translator.RequestExecutor;
import translator.Translator;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.LinkedList;

public class ProcessingHandler extends ChannelInboundHandlerAdapter {
    private String datasetLocation;

    public ProcessingHandler(String datasetLocation) {
        this.datasetLocation = datasetLocation;
    }

    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg)
            throws Exception {
        RequestData requestData = (RequestData) msg;
        String request = requestData.getStringValue();
        Long key = Thread.currentThread().getId();
        LinkedList<Object[]> list;
        try {
            RequestExecutor re = new RequestExecutor(request, datasetLocation, key.toString());
            list = re.execute();
        }catch (IllegalArgumentException e){
            list = new LinkedList<>();
            list.add(new Object[]{e.getMessage(), null, "txt", new String[] {"no"}});
        }catch (Exception e) {
            list = new LinkedList<>();
            list.add(new Object[]{e.getMessage(), null, "txt", new String[] {"no"}});
        }
        ResponseData responseData = new ResponseData();
        for(Object[] mas : list){
            if(mas[0].getClass().equals(Coverage.class)){
                ResponseItem<byte[]> item = new ResponseItem<>();
                String file = ((Coverage)mas[0]).getCoverageName();
                byte[] array = Files.readAllBytes(Paths.get(file));
                item.setItem(array);
                item.setExtension((String)mas[2]);
                item.setFilenames((String[])mas[3]);
                responseData.addItem(item);
            } else if(mas[0].getClass().equals(String.class)){
                ResponseItem<String> item = new ResponseItem<>();
                item.setItem((String)mas[0]);
                item.setExtension((String)mas[2]);
                item.setFilenames((String[])mas[3]);
                responseData.addItem(item);
            } else if(mas[0].getClass().equals(Byte.class)){
                ResponseItem<Byte> item = new ResponseItem<>();
                item.setItem((Byte)mas[0]);
                item.setExtension((String)mas[2]);
                item.setFilenames((String[])mas[3]);
                responseData.addItem(item);
            } else if(mas[0].getClass().equals(Short.class)){
                ResponseItem<Short> item = new ResponseItem<>();
                item.setItem((Short) mas[0]);
                item.setExtension((String)mas[2]);
                item.setFilenames((String[])mas[3]);
                responseData.addItem(item);
            } else if(mas[0].getClass().equals(Integer.class)){
                ResponseItem<Integer> item = new ResponseItem<>();
                item.setItem((Integer) mas[0]);
                item.setExtension((String)mas[2]);
                item.setFilenames((String[])mas[3]);
                responseData.addItem(item);
            } else if(mas[0].getClass().equals(Float.class)){
                ResponseItem<Float> item = new ResponseItem<>();
                item.setItem((Float)mas[0]);
                item.setExtension((String)mas[2]);
                item.setFilenames((String[])mas[3]);
                responseData.addItem(item);
            } else if(mas[0].getClass().equals(Double.class)){
                ResponseItem<Double> item = new ResponseItem<>();
                item.setItem((Double)mas[0]);
                item.setExtension((String)mas[2]);
                item.setFilenames((String[])mas[3]);
                responseData.addItem(item);
            }
        }

        for(Object[] mas : list){
            if(mas[1] != null){
                Translator t = (Translator)mas[1];
                t.deleteAll();
            }
        }

        ChannelFuture future = ctx.writeAndFlush(responseData);
        future.addListener(ChannelFutureListener.CLOSE);
    }
}