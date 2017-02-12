package com.javabrains.springboot.controller;

import com.javabrains.springboot.entity.Person;
import com.javabrains.springboot.service.BusinessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Libin on 1/29/2017.
 */

@RestController
public class Controller {
    
    @Autowired
    private BusinessService service;

    @RequestMapping(value="/getDetails/{name}")
    public Person getPerson(@PathVariable  String name ){
        return null;
    }

    @RequestMapping(method = RequestMethod.POST, value = "/postPerson")
    public void addPerson(@RequestBody Person person){
        service.addPerson(person);
    }

    @RequestMapping(value = "/getPersons")
    public List<Person> getAllPerson() {
        return service.listaAllPerson();
    }
}
