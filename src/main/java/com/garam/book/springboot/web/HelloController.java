package com.garam.book.springboot.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//기존 Controller 에 @ResponseBody 가 추가된 것으로
//응답값을 json으로 반환한다는 특징이 Controller와 다름
@RestController
public class HelloController {
    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }
}
