package com.fection.www.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Permissions {
    private Integer pid;

    private String pname;

    private String pinfo;

}