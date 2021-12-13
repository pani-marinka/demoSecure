package com.example.demoSecure.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "email")
    private String email;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "pass")
    private String password;
    @Enumerated(value = EnumType.STRING)
    @Column
    private Role role;
    @Enumerated(value = EnumType.STRING)
    @Column
    private Status status;

}
