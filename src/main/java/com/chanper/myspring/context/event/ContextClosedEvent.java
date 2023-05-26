package com.chanper.myspring.context.event;

import com.chanper.myspring.context.ApplicationContext;

public class ContextClosedEvent extends ApplicationContextEvent {

    public ContextClosedEvent(Object source) {
        super(source);
    }
}
