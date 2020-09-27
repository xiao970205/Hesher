package com.Hesher;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.Hesher.mapper")
@SpringBootApplication
public class HesherStudioApplication {

    public static void main(String[] args) {
        SpringApplication.run(HesherStudioApplication.class, args);
    }

}
