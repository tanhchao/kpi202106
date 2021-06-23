package com.example.kpi202106demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.kpi202106demo.mapper")
public class Kpi202106demoApplication {

    public static void main(String[] args) {
        SpringApplication.run(Kpi202106demoApplication.class, args);
    }

}
