package com.muharremtac.utils.mapper.samples.model;

import com.muharremtac.utils.mapper.EntityField;

public class ModelPerson {

    @EntityField (entityField = "name")
    private String isim;


    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }
}
