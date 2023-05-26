package com.chanper.myspring.context;

import java.util.EventListener;

public interface ApplicationListener<E extends ApplicationEvent> extends EventListener {

    /**
     * handle an application event
     *
     * @param event the event to respond to
     */
    void onApplicationEvent(E event);
}
