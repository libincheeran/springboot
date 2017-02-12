package com.javabrains.springboot.service;

import com.javabrains.springboot.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

/**
 * Created by Libin on 1/29/2017.
 */
@Service
public class BusinessService {

    @Autowired
    private DataRepository dataRep;


    public List<Person> listaAllPerson() {

        List<Person> personList = new ArrayList<Person>();
        Iterator<Person> it = dataRep.findAll().iterator();
        while ( it.hasNext() ){
            personList.add(it.next());
        }
        return personList;
    }

    public void addPerson( Person person ){
        dataRep.save(person);
    }
}
