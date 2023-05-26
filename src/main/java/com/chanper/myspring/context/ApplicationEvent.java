package com.chanper.myspring.context;

import java.util.EventObject;

public abstract class ApplicationEvent extends EventObject {
    /**
     * Constructs a prototypical Event
     *
     * @param source
     */
    public ApplicationEvent(Object source) {
        super(source);
    }
}
