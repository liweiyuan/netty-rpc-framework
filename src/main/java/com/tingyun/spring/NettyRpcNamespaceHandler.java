package com.tingyun.spring;

import org.springframework.beans.factory.xml.NamespaceHandlerSupport;

/**
 * Created by spark on 17-10-19.
 * @author  spark
 * 解析自定义的标签
 */
public class NettyRpcNamespaceHandler extends NamespaceHandlerSupport{
    public void init() {
        registerBeanDefinitionParser("service",new NettyRpcServiceParser());
    }
}
