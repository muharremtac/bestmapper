package com.muharremtac.utils.mapper.core;

import com.muharremtac.utils.mapper.EntityField;
import com.muharremtac.utils.mapper.samples.model.ModelPerson;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

public class BestMapperImpl extends BestMapper{

    @Override
    public Object mapFromTo(Object from, Object to) throws Exception {
        Object returnObject = null;

        Class<?> fromObjectClass = from.getClass();
        Class<?> toObjectClass = to.getClass();

        for (Field field : toObjectClass.getDeclaredFields()) {
            Annotation annotation = field.getAnnotation(EntityField.class);
            EntityField entityField = (EntityField)annotation;

            Class<?> clazz = Class.forName(to.getClass().getName());
            returnObject = clazz.newInstance();

            Field toField = fromObjectClass.getDeclaredField(entityField.entityField());

            toField.set(toField, entityField.entityField());



            System.out.println(field.getName());
        }

         return returnObject;
    }
}
