package com.fection.www.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Images {
    private Integer iid;

    private Integer bid;

    private Integer uid;

    private String uimg;

    private String bimg;
}