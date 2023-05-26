package com.chanper.myspring.test.event;

import com.chanper.myspring.context.ApplicationListener;
import com.chanper.myspring.context.event.ContextClosedEvent;

public class ContextClosedEventListener implements ApplicationListener<ContextClosedEvent> {
    @Override
    public void onApplicationEvent(ContextClosedEvent event) {
        System.out.println("关闭事件：" + this.getClass().getName());
    }
}
