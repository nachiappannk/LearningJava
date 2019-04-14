package com.nachiappan.learningjava;

import lombok.*;

@ToString
@AllArgsConstructor
@Builder
public class Employee
{
    private String name;
    private String lastName;
    private String emailId;
}
