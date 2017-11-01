package com.muharremtac.utils.mapper.test;

import com.muharremtac.utils.mapper.BestMapper;
import com.muharremtac.utils.mapper.samples.BestMapperImpl;
import com.muharremtac.utils.mapper.samples.entity.EntityPerson;
import com.muharremtac.utils.mapper.samples.model.ModelPerson;

public class BestMapperTest {

    public static void main(String[] args) {
        BestMapper bestMapper = new BestMapperImpl();

        EntityPerson entityPerson = new EntityPerson();
        entityPerson.setName("Entity");

        ModelPerson modelPerson = new ModelPerson();
        modelPerson.setIsim("Model");

        EntityPerson mappedPerson = (EntityPerson) bestMapper.mapFromTo(entityPerson, modelPerson);

        System.out.println(mappedPerson);
    }

}
