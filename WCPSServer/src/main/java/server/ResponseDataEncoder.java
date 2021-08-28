package server;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToByteEncoder;
import translator.Coverage;

import java.nio.charset.StandardCharsets;

public class ResponseDataEncoder
        extends MessageToByteEncoder<ResponseData> {

    public enum DataType{
        Byte, Short, Int, Float, Double, String, Coverage;
    }

    @Override
    protected void encode(ChannelHandlerContext ctx,
                          ResponseData msg, ByteBuf out) throws Exception {
        int len = msg.getSize();
        out.writeInt(len);
        for(int i = 0; i < len; i++){
            ResponseItem item = msg.getItem(i);
            if(item.getItem().getClass().equals(byte[].class)){
                out.writeInt(DataType.Coverage.ordinal());
                writeFileInfo(out, item);
                byte[] mes = (byte[]) item.getItem();
                out.writeInt(mes.length);
                out.writeBytes(mes);
            } else if(item.getItem().getClass().equals(String.class)){
                out.writeInt(DataType.String.ordinal());
                writeFileInfo(out, item);
                String mes = (String) item.getItem();
                writeString(out, mes);
            } else if(item.getItem().getClass().equals(Byte.class)){
                out.writeInt(DataType.Byte.ordinal());
                writeFileInfo(out, item);
                Byte mes = (Byte) item.getItem();
                out.writeByte(mes);
            } else if(item.getItem().getClass().equals(Short.class)){
                out.writeInt(DataType.Short.ordinal());
                writeFileInfo(out, item);
                Short mes = (Short) item.getItem();
                out.writeShort(mes);
            } else if(item.getItem().getClass().equals(Integer.class)){
                out.writeInt(DataType.Int.ordinal());
                writeFileInfo(out, item);
                Integer mes = (Integer) item.getItem();
                out.writeInt(mes);
            } else if(item.getItem().getClass().equals(Float.class)){
                out.writeInt(DataType.Float.ordinal());
                writeFileInfo(out, item);
                Float mes = (Float) item.getItem();
                out.writeFloat(mes);
            } else if(item.getItem().getClass().equals(Double.class)){
                out.writeInt(DataType.Double.ordinal());
                writeFileInfo(out, item);
                Double mes = (Double) item.getItem();
                out.writeDouble(mes);
            }
        }
    }

    private void writeFileInfo(ByteBuf out, ResponseItem item){
        String[] fileNames = item.getFilenames();
        out.writeInt(fileNames.length);
        for(String str : fileNames){
            writeString(out, str);
        }
        String extension = (String) item.getExtension();
        writeString(out, extension);
    }

    private void writeString(ByteBuf out, String str){
        out.writeInt(str.length());
        out.writeCharSequence(str, StandardCharsets.UTF_8);
    }
}