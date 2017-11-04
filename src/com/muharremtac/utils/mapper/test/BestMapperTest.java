package com.muharremtac.utils.mapper.test;

import com.muharremtac.utils.mapper.core.BestMapper;
import com.muharremtac.utils.mapper.core.BestMapperImpl;
import com.muharremtac.utils.mapper.samples.entity.Address;
import com.muharremtac.utils.mapper.samples.entity.EntityPerson;
import com.muharremtac.utils.mapper.samples.model.PersonDto;

public class BestMapperTest {

    public static void main(String[] args) throws Exception {
        BestMapper bestMapper = new BestMapperImpl();

        EntityPerson entityPerson = new EntityPerson();
        entityPerson.setAge(41);
        entityPerson.setName("Muharrem");
        entityPerson.setLastName("Tac");
        Address address = new Address();
        address.setStreet("Hacı Hasan Sokak");
        entityPerson.setAddress(address);

        PersonDto mappedPerson = (PersonDto) bestMapper.mapFromTo(entityPerson, PersonDto.class);

        System.out.println(mappedPerson);
    }

}
