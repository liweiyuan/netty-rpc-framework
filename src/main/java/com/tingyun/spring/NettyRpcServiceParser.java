package com.tingyun.spring;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.beans.factory.xml.BeanDefinitionParser;
import org.springframework.beans.factory.xml.ParserContext;
import org.w3c.dom.Element;

/**
 * Created by spark on 17-10-19.
 */
public class NettyRpcServiceParser implements BeanDefinitionParser {
    public BeanDefinition parse(Element element, ParserContext parserContext) {
        String interfaceName = element.getAttribute("interfaceName");
        String ref = element.getAttribute("ref");
        String filter = element.getAttribute("com/tingyun/filter");

        RootBeanDefinition rootBeanDefinition = new RootBeanDefinition();
        rootBeanDefinition.setBeanClass(NettyRpcService.class);
        rootBeanDefinition.setLazyInit(false);
        rootBeanDefinition.getPropertyValues().addPropertyValue("interface", interfaceName);
        rootBeanDefinition.getPropertyValues().addPropertyValue("ref", ref);
        rootBeanDefinition.getPropertyValues().addPropertyValue("com/tingyun/filter", filter);

        parserContext.getRegistry().registerBeanDefinition(interfaceName, rootBeanDefinition);
        return rootBeanDefinition;
    }
}
