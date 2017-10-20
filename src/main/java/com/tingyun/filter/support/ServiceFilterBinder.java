package com.tingyun.filter.support;

/**
 * Created by spark on 17-10-20.
 */
public class ServiceFilterBinder {
    private Object object;
    private Filter filter;

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }

    public Filter getFilter() {
        return filter;
    }

    public void setFilter(Filter filter) {
        this.filter = filter;
    }
}
