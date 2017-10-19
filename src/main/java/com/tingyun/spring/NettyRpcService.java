package com.tingyun.spring;

import com.tingyun.event.ServerStartEvent;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

/**
 * Created by spark on 17-10-19.
 */
public class NettyRpcService  implements ApplicationContextAware, ApplicationListener {
    private String interfaceName;
    private String ref;
    private String filter;
    private ApplicationContext applicationContext;

    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext=applicationContext;
        applicationContext.publishEvent(new ServerStartEvent(new Object()));
    }

    public void onApplicationEvent(ApplicationEvent applicationEvent) {
        //2017年10月19日23:02:56  后面继续
    }
}
