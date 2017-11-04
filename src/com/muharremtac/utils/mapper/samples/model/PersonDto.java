package com.muharremtac.utils.mapper.samples.model;

import com.muharremtac.utils.mapper.annotations.EntityField;

public class PersonDto {

    @EntityField (entityField = "age")
    private int yas;

    @EntityField (entityField = "name")
    private String isim;

    @EntityField (entityField = "lastName")
    private String soyIsim;

    @EntityField (entityField = "address")
    private Adres adres;

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    @Override
    public String toString() {
        return yas+" "+isim + " "+ soyIsim + "\n"+ adres;
    }

    public String getSoyIsim() {
        return soyIsim;
    }

    public void setSoyIsim(String soyIsim) {
        this.soyIsim = soyIsim;
    }

    public Adres getAdres() {
        return adres;
    }

    public void setAdres(Adres adres) {
        this.adres = adres;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }
}
