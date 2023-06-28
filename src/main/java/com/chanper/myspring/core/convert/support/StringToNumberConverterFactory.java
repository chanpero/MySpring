package com.chanper.myspring.core.convert.support;

import com.chanper.myspring.core.convert.converter.Converter;
import com.chanper.myspring.core.convert.converter.ConverterFactory;
import com.chanper.myspring.util.NumberUtils;

public class StringToNumberConverterFactory implements ConverterFactory<String, Number> {


    @Override
    public <T extends Number> Converter<String, T> getConverter(Class<T> targetType) {
        return new StringToNumber<>(targetType);
    }

    private static final class StringToNumber<T extends Number> implements Converter<String, T> {

        private final Class<T> targetClass;

        public StringToNumber(Class<T> targetClass) {
            this.targetClass = targetClass;
        }

        @Override
        public T convert(String source) {
            if (source.isEmpty())
                return null;
            return NumberUtils.parseNumber(source, this.targetClass);
        }
    }
}
