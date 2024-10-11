package com.kraft.jenkins_instance;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/jenkins")
public class jenkins_controller_instance {

        @RequestMapping("/hello")
        public String hello() {
            return "Hello Jenkins on Virtual Machine:v5 ";
        }
}
