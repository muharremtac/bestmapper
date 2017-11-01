package com.muharremtac.utils.mapper.samples.model;

import com.muharremtac.utils.mapper.EntityField;

public class PersonDto {

    @EntityField (entityField = "name")
    private String isim;

    @EntityField (entityField = "lastName")
    private String soyIsim;

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    @Override
    public String toString() {
        return isim + " "+ soyIsim;
    }

    public String getSoyIsim() {
        return soyIsim;
    }

    public void setSoyIsim(String soyIsim) {
        this.soyIsim = soyIsim;
    }
}
