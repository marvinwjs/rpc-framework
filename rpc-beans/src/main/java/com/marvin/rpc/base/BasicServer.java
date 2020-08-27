package com.marvin.rpc.base;

/**
 * @author wuyujian
 * @date 2020-08-27 14:42
 */
public abstract class BasicServer implements IServer{
    protected boolean isRunning;

    public boolean isRunning(){
        return this.isRunning;
    }
}
