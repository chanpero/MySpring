package com.chanper.myspring.context.event;

import com.chanper.myspring.context.ApplicationEvent;
import com.chanper.myspring.context.ApplicationListener;

public interface ApplicationEventMulticaster {

    void addApplicationListener(ApplicationListener<?> listener);

    void removeApplicationListener(ApplicationListener<?> listener);

    void multicastEvent(ApplicationEvent event);
}
