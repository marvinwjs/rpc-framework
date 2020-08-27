package com.marvin.rpc.netty.handler;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.ByteToMessageDecoder;

import java.util.List;

/**
 * 消息解析器
 *
 * @author Marvin
 * @date 2020-08-27 20:00
 */
public class MessageDecoder extends ByteToMessageDecoder {
    public static final byte HEAD_FLAG = 0x7e;
    public static final byte TAIL_FLAG = 0x7e;

    @Override
    protected void decode(ChannelHandlerContext channelHandlerContext, ByteBuf byteBuf, List<Object> list) throws Exception {
        byteBuf.markReaderIndex();
        byte[] array;
        if(byteBuf.isDirect()){
            //堆外内存
            array = new byte[byteBuf.readableBytes()];
            byteBuf.getBytes(byteBuf.readerIndex(),array);
        } else{
            array = byteBuf.array();
        }
        byte[] result = null;
        for(byte b : array){
            if(result == null && b == HEAD_FLAG){
                result = new byte[1024];
            }


        }

    }
}
