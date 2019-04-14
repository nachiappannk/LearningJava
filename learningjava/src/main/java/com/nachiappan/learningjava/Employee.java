package com.nachiappan.learningjava;

import lombok.Setter;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

@Setter
@ToString
@Slf4j
public class Employee
{
    private String name;
    private String lastName;
    private String emailId;

    public void greet(){
        log.debug("start of greet method");
        System.out.println("Hello, how are you?");
        log.debug("end of greet method");
    }
}
