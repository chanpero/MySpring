package com.chanper.myspring.context;

import com.chanper.myspring.beans.factory.HierarchicalBeanFactory;
import com.chanper.myspring.beans.factory.ListableBeanFactory;
import com.chanper.myspring.core.io.ResourceLoader;

public interface ApplicationContext extends ListableBeanFactory, HierarchicalBeanFactory, ResourceLoader, ApplicationEventPublisher {
}
