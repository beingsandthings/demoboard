package com.bootcamp.demoboard.entity.sdo;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class BoardCdo {

    private String id;
    private String userId;
    private String title;
    private String content;
    private String password;
    private String date;
    private String hit;



}
