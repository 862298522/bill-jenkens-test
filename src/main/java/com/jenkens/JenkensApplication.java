package com.jenkens;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author huangdalin
 * @Description TODO
 * Date 2023/12/16 16:26
 */

@SpringBootApplication
@Slf4j
public class JenkensApplication {
    public static void main(String[] args) {
        SpringApplication.run(JenkensApplication.class,args);
        log.info("Jenkins application started----------------");
    }
}
