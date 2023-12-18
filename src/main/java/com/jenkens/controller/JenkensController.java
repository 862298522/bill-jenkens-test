package com.jenkens.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author huangdalin
 * @Description TODO
 * Date 2023/12/18 10:25
 */

@RestController
@RequestMapping("/hello")
@Slf4j
public class JenkensController {
    public String hello(){
        log.info("laile");
        return "Hello nice  !";
    }
}
