package com.example.ch141;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // 等价于 @Controller + @ResponseBody
public class HelloController {
    @GetMapping("/hello") // 处理 GET 请求，路径为 /hello
    public String hello() {
        return "Hello Spring Boot!";
    }
}