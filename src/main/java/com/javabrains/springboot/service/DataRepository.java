package com.javabrains.springboot.service;

import com.javabrains.springboot.entity.Person;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Libin on 2/5/2017.
 */
public interface DataRepository extends CrudRepository<Person,String>{
}
