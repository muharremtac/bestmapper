package com.muharremtac.utils.mapper.core;

public abstract class BestMapper<L, T> {

    public abstract L mapFromTo(T from, Class to) throws Exception;

}
