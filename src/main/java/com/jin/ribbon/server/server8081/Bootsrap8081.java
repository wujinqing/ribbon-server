package com.jin.ribbon.server.server8081;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wu.jinqing
 * @date 2019年12月21日
 */
@SpringBootApplication
@RestController
public class Bootsrap8081 {
    public static void main(String[] args) {
        SpringApplication.run(Bootsrap8081.class, args);
    }

    @RequestMapping("/getName")
    public String getName()
    {
        return "name from 8081";
    }

    @RequestMapping("/a")
    public String home()
    {
        return "hello 8081";
    }

}
