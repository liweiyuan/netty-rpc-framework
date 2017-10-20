package com.tingyun.spring;

import com.tingyun.event.ServerStartEvent;
import com.tingyun.filter.support.Filter;
import com.tingyun.filter.support.ServiceFilterBinder;
import com.tingyun.netty.MessageRecvExecutor;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

/**
 * Created by spark on 17-10-19.
 */
public class NettyRpcService implements ApplicationContextAware, ApplicationListener {
    private String interfaceName;
    private String ref;
    private String filter;
    private ApplicationContext applicationContext;

    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
        applicationContext.publishEvent(new ServerStartEvent(new Object()));
    }

    public void onApplicationEvent(ApplicationEvent applicationEvent) {
        //2017年10月19日23:02:56  后面继续
        ServiceFilterBinder binder = new ServiceFilterBinder();
        if (StringUtils.isBlank(filter) || !(applicationContext.getBean(filter) instanceof Filter)) {
            binder.setObject(applicationContext.getBean(ref));
        } else {
            binder.setObject(applicationContext.getBean(ref));
            binder.setFilter((Filter) applicationContext.getBean(filter));
        }
        MessageRecvExecutor.getInstance().getHandlerMap().put(interfaceName, binder);
    }

    public String getInterfaceName() {
        return interfaceName;
    }

    public void setInterfaceName(String interfaceName) {
        this.interfaceName = interfaceName;
    }

    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public String getFilter() {
        return filter;
    }

    public void setFilter(String filter) {
        this.filter = filter;
    }

    public ApplicationContext getApplicationContext() {
        return applicationContext;
    }
}
