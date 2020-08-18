package com.fection.www.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private Integer uid;

    private Integer brid;

    private String uname;

    private String uemail;

    private String uphone;
}