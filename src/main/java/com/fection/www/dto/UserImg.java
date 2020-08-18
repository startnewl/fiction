package com.fection.www.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserImg {
    private String uname;

    private String uemail;

    private String uphone;

    private String uimg;
}
