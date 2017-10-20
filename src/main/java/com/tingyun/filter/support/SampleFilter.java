package com.tingyun.filter.support;

import org.apache.commons.lang3.StringUtils;

import java.lang.reflect.Method;

/**
 * Created by spark on 17-10-20.
 */
public class SampleFilter implements Filter{
    public boolean before(Method method, Object processor, Object[] requestObjects) {
        System.out.println(StringUtils.center("[SimpleFilter##before]", 48, "*"));
        return true;
    }


    public void after(Method method, Object processor, Object[] requestObjects) {
        System.out.println(StringUtils.center("[SimpleFilter##after]", 48, "*"));
    }
}
