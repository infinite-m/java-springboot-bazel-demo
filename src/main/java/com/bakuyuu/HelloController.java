package com.bakuyuu;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author bakuyuu
 * @date 2022/2/24
 */
@RestController
public class HelloController {

    /**
     * commit 1
     * @return
     */
    @GetMapping("/hello")
    public String hello() {
        return "hello world";
    }
}
