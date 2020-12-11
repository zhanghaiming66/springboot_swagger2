package com.example.demo;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Api(value = "用户controller", tags = {"用户操作接口"})
@RestController
public class DemoController {

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    @ApiOperation(value = "测试", notes = "测试")
    public Book testmode() {
        System.out.printf("123");
        Book book = new Book("码农翻身", "100.0", "张三");
        BookSimple bookSimple = new BookSimple();

        System.out.printf(bookSimple.toString());
        return book;
    }
}
