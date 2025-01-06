package com.jwt.SpringSecEx;

import lombok.*;

@Setter
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
@Getter
public class Student {
    private int id;
    private String name;
    private int marks;
}
