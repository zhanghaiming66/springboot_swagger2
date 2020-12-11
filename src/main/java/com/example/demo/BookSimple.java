package com.example.demo;

import io.swagger.annotations.ApiParam;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BookSimple {

    @ApiParam(name = "name",value = "姓名")
    private String name;
    @ApiParam(name = "price",value = "价格")
    private String price;

}
