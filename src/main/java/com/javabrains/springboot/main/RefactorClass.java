package com.javabrains.springboot.main;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Libin on 2/11/2017.
 */
public class RefactorClass {


    public void value(String test) {

        List<String> list2 = new ArrayList<String>();

        for ( String s : list2 ) {
            System.out.println(s);
        }

        String query = "select * from person";

    }
}
