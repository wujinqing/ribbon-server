package com.jin.ribbon.server.server8082;

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
public class Bootsrap8082 {
    public static void main(String[] args) {
        SpringApplication.run(Bootsrap8082.class, args);
    }

    @RequestMapping("/getName")
    public String getName()
    {
        return "name from 8082";
    }

    @RequestMapping("/a")
    public String home()
    {
        return "hello 8082";
    }
}
