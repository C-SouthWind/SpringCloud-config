package com.chj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @author ：chj
 * @date ：Created in 2020/5/6 17:20
 * @params :
 */
@SpringBootApplication
@EnableConfigServer
public class Application3080 {
    public static void main(String[] args) {
        SpringApplication.run(Application3080.class,args);
    }
}
