package com.tester.model;


import lombok.Data;

@Data
public class GetUserListCase {

    private int id;
    private String userName;
    private String age;
    private String sex;
    private String expected;


}
