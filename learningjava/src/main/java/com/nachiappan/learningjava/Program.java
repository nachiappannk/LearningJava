package com.nachiappan.learningjava;

public class Program {
    public static void main(String[] args) {

        Employee employee = new Employee();
        employee.setName("Shiva");
        employee.setLastName("Kumar");
        employee.setEmailId("shiva.kumar@gmail.com");

        employee.greet();
        System.out.println(employee);
    }
}

