package com.chanper.myspring.core.convert.converter;

public interface Converter<S, T> {

    // convert the object from type s to type t
    T convert(S source);
}
