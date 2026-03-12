package cn.zhao.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("cn.zhao.demo.mapper")
public class AoApplication {

    public static void main(String[] args) {
        SpringApplication.run(AoApplication.class, args);
    }

}
