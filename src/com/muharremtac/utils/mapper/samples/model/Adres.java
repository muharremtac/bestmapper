package com.muharremtac.utils.mapper.samples.model;

import com.muharremtac.utils.mapper.annotations.EntityField;

public class Adres {

    @EntityField(entityField = "street")
    private String sokak;

    @Override
    public String toString() {
        return sokak;
    }

    public String getSokak() {
        return sokak;
    }

    public void setSokak(String sokak) {
        this.sokak = sokak;
    }
}
