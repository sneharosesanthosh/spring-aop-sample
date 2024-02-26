package com.sample.aop;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class AopController {
    @PostMapping
    public void normalMethod() {
        log.info("normal method called");
    }
}
