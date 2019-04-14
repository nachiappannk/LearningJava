package com.nachiappan.learningjava;

public class Program {
    public static void main(String[] args) {

        Employee employee= Employee.builder()
                .lastName("Kumar")
                .name("Shiva")
                .emailId("shiva.kumar@gmail.com")
                .build();

        System.out.println(employee);
    }
}

