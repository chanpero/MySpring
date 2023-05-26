package com.chanper.myspring.context;

public interface ApplicationEventPublisher {

    /**
     * Notify all listeners registered with this application of an application event
     *
     * @param event
     */
    void publishEvent(ApplicationEvent event);
}
