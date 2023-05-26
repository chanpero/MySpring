package com.chanper.myspring.context.event;

import com.chanper.myspring.context.ApplicationContext;
import com.chanper.myspring.context.ApplicationEvent;

/**
 * Base class for events raised for an ApplicationContext.
 */
public class ApplicationContextEvent extends ApplicationEvent {
    public ApplicationContextEvent(Object source) {
        super(source);
    }

    public final ApplicationContext getApplicationContext() {
        return (ApplicationContext) getSource();
    }
}
