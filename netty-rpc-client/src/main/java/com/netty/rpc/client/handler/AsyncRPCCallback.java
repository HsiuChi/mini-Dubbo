package com.netty.rpc.client.handler;

/**
 * Created by zhangxiuqi on 2023-06.
 */
public interface AsyncRPCCallback {

    void success(Object result);

    void fail(Exception e);

}
