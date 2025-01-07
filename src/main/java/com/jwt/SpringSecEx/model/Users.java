package com.jwt.SpringSecEx.model;


import lombok.*;

@Setter
@Getter
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Ent
public class Users {
    @Id
    private int id;
    private String username;
    private String password;
}
