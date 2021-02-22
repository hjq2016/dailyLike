package com.austin.daily.annotation;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description
 * @Author hjq
 * @Date 2021/1/7
 */

@RestController
@FirstAnnotation
public class TestController {
    @FirstAnnotation
    @RequestMapping("annotationFirst")
    public String function(@FirstAnnotation String aa) {

        return "kkk";
    }
}
