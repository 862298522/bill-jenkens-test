package com.jenkens.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author huangdalin
 * @Description TODO
 * Date 2023/12/18 10:25
 */

@RestController
@RequestMapping("/hello")
public class JenkensController {
    public String hello(){
        return "Hello nice  !";
    }
}
