package com.yz.yelp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//指定basepackage可以避免全局扫描因为真实环境会有很多层级
@SpringBootApplication(scanBasePackages = {"com.yz.yelp"})
public class YelpApplication {

    public static void main(String[] args) {
        SpringApplication.run(YelpApplication.class, args);
    }

}
