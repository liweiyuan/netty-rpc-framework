package com.tingyun.netty;

import com.tingyun.compiler.RpcSerializeProtocol;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * Created by spark on 17-10-20.
 */
public class MessageRecvExecutor implements ApplicationContextAware{

    private String serviceAddress;
    private int echoApiPort;
    private RpcSerializeProtocol serializeProtocol = RpcSerializeProtocol.JDKSERIALIZE;


    //时间2017年10月20日23:29:00

    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {

    }
}
