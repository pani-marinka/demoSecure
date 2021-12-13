package com.example.demoSecure.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data   //get, set
@AllArgsConstructor
public class Developer {
    private Long id;
    private String firstName;
    private String lastName;
}
