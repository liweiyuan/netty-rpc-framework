package com.tingyun.bootstrap;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by spark on 17-10-19.
 * rpc服务启动类
 */
public class RpcBootstrap {


    public static void main(String[] args) {
        new ClassPathXmlApplicationContext("classpath:netty-rpc-server.xml");
    }
}
