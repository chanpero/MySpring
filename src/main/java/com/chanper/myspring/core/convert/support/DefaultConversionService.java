package com.chanper.myspring.core.convert.support;

import com.chanper.myspring.core.convert.converter.ConverterRegistry;

public class DefaultConversionService extends GenericConversionService {

    public DefaultConversionService() {
        addDefaultConverters(this);
    }

    public static void addDefaultConverters(ConverterRegistry converterRegistry) {
        converterRegistry.addConverterFactory(new StringToNumberConverterFactory());

    }


}
