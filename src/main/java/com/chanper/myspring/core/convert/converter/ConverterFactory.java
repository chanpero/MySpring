package com.chanper.myspring.core.convert.converter;

public interface ConverterFactory<S, R> {

    // get the converter to convert from type s to t
    <T extends R> Converter<S, T> getConverter(Class<T> targetType);
}
