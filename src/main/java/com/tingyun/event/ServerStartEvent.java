package com.tingyun.event;

import org.springframework.context.ApplicationEvent;

/**
 * Created by spark on 17-10-19.
 */
public class ServerStartEvent extends ApplicationEvent {
    public ServerStartEvent(Object o) {
        super(o);
    }
}
