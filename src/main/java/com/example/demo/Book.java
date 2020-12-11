package com.example.demo;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Book implements Serializable {

    @ApiModelProperty(name = "name", value = "姓名")
    private String name;
    @ApiModelProperty(name = "price", value = "价格")
    private String price;
    @ApiModelProperty(name = "auth", value = "作者")
    private String auth;

}
