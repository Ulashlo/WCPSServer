package client;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.ReplayingDecoder;

import java.nio.charset.StandardCharsets;
import java.util.List;

public class ResponseDataDecoder
        extends ReplayingDecoder<ResponseData> {

    public enum DataType{
        Byte, Short, Int, Float, Double, String, Coverage;
    }

    @Override
    protected void decode(ChannelHandlerContext ctx,
                          ByteBuf in, List<Object> out) throws Exception {
        ResponseData data = new ResponseData();
        int len = in.readInt();
        for(int i = 0; i < len; i++){
            int type = in.readInt();
            if(type == DataType.Coverage.ordinal()){
                ResponseItem<byte[]> item = new ResponseItem<>();
                readFileNames(in, item);
                int l = in.readInt();
                byte[] mas = new byte[l];
                in.readBytes(mas);
                item.setItem(mas);
                data.addItem(item);
            } else if(type == DataType.String.ordinal()){
                ResponseItem<String> item = new ResponseItem<>();
                readFileNames(in, item);
                item.setItem(readString(in));
                data.addItem(item);
            } else if(type == DataType.Byte.ordinal()){
                ResponseItem<Byte> item = new ResponseItem<>();
                readFileNames(in, item);
                item.setItem(in.readByte());
                data.addItem(item);
            } else if(type == DataType.Short.ordinal()){
                ResponseItem<Short> item = new ResponseItem<>();
                readFileNames(in, item);
                item.setItem(in.readShort());
                data.addItem(item);
            } else if(type == DataType.Int.ordinal()){
                ResponseItem<Integer> item = new ResponseItem<>();
                readFileNames(in, item);
                item.setItem(in.readInt());
                data.addItem(item);
            } else if(type == DataType.Float.ordinal()){
                ResponseItem<Float> item = new ResponseItem<>();
                readFileNames(in, item);
                item.setItem(in.readFloat());
                data.addItem(item);
            } else if(type == DataType.Double.ordinal()){
                ResponseItem<Double> item = new ResponseItem<>();
                readFileNames(in, item);
                item.setItem(in.readDouble());
                data.addItem(item);
            }
        }
        out.add(data);
    }

    private void readFileNames(ByteBuf in, ResponseItem item){
        int len = in.readInt();
        String[] names = new String[len];
        for(int i = 0; i < len; i++){
            names[i] = readString(in);
        }
        item.setFilenames(names);
        item.setExtension(readString(in));
    }

    private String readString(ByteBuf in){
        int len = in.readInt();
        return in.readCharSequence(len, StandardCharsets.UTF_8).toString();
    }
}
