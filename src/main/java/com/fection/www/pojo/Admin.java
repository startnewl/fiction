package com.fection.www.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Admin {
    private Integer aid;

    private String aname;

    private String apass;

    private String aemail;

    private String aphone;

}