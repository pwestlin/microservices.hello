package nuwestlin.microservices.hello.hello;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.inject.Inject;

@SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
@RestController
@RequestMapping("/")
public class Controller {

    private final WhatService whatService;
    private final WhoService whoService;

    @Inject
    public Controller(WhatService whatService, WhoService whoService) {
        this.whatService = whatService;
        this.whoService = whoService;
    }

    @GetMapping(value = "hello", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public String hello() {
        return whatService.what() + ", " + whoService.who() + "!";
    }

}
