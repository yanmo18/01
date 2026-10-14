package com.example.ch141;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.example.ch141") // 替换为实际包名
public class Ch141Application {
    public static void main(String[] args) {
        SpringApplication.run(Ch141Application.class, args);
    }
}