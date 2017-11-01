package com.muharremtac.utils.mapper;

public abstract class BestMapper<L, T, C> {

    public abstract L mapFromTo(T from, C to);

}
