package com.muharremtac.utils.mapper.core;

import com.muharremtac.utils.mapper.annotations.EntityField;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

public class BestMapperImpl extends BestMapper{

    @Override
    public Object mapFromTo(Object fromObject, Class toClass) throws Exception {
        Object returnObject = null;
        Class<?> clazz = Class.forName(toClass.getName());
        returnObject = clazz.newInstance();

        Class<?> fromObjectClass = fromObject.getClass();

        for (Field field : toClass.getDeclaredFields()) {
            Annotation annotation = field.getAnnotation(EntityField.class);
            EntityField entityField = (EntityField)annotation;
            Field fromObjectField = fromObjectClass.getDeclaredField(entityField.entityField());
            fromObjectField.setAccessible(true);
            Object value = fromObjectField.get(fromObject);

            Field toField = toClass.getDeclaredField(field.getName());

            Class<?> fromFieldType = fromObjectField.getType();
            Class<?> toFieldType = toField.getType();
            if(fromFieldType.equals(toFieldType)==false){
                value = mapFromTo(value, toFieldType);
            }

            toField.setAccessible(true);
            toField.set(returnObject, value);
        }

         return returnObject;
    }
}
