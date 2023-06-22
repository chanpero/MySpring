package com.chanper.myspring.context.annotation;

import cn.hutool.core.util.ClassUtil;
import com.chanper.myspring.beans.factory.config.BeanDefinition;
import com.chanper.myspring.stereotype.Component;
import com.chanper.myspring.util.ClassUtils;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * A component provider that scans the classpath from a base package.
 * Then use filters to find candidates
 */
public class ClassPathScanningCandidateComponentProvider {

    public Set<BeanDefinition> findCandidateComponents(String basePackage) {
        Set<BeanDefinition> candidates = new LinkedHashSet<>();
        Set<Class<?>> classes = ClassUtil.scanPackageByAnnotation(basePackage, Component.class);
        for (Class<?> clazz : classes) {
            candidates.add(new BeanDefinition(clazz));
        }
        return candidates;
    }
}
