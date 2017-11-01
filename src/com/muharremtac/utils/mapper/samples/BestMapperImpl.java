package com.muharremtac.utils.mapper.samples;

import com.muharremtac.utils.mapper.BestMapper;
import com.muharremtac.utils.mapper.EntityField;
import com.muharremtac.utils.mapper.samples.entity.EntityPerson;
import com.muharremtac.utils.mapper.samples.model.ModelPerson;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class BestMapperImpl extends BestMapper{

    @Override
    public Object mapFromTo(Object from, Object to) {
        Class<EntityField> obj = EntityField.class;
        Object returnObject = null;

        Annotation annotation = obj.getAnnotation(EntityField.class);
        EntityField entityFieldAnnotation = (EntityField) annotation;
        String fieldName = entityFieldAnnotation.entityField();

        for (Field field : obj.getDeclaredFields()) {
            System.out.println(field.getName());
        }

         return returnObject;
    }
}
