package com.jin.ribbon.server.server8080;

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
public class Bootsrap8080 {
    public static void main(String[] args) {
        SpringApplication.run(Bootsrap8080.class, args);
    }

    @RequestMapping("/getName")
    public String getName()
    {
        return "name from 8080";
    }

    @RequestMapping("/a")
    public String home()
    {
        return "hello 8080";
    }
}
