package nuwestlin.microservices.hello.saywhat;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.inject.Inject;

@RestController
@RequestMapping("/")
public class Controller {

    private final WhatRepository whatRepository;

    @Inject
    public Controller(WhatRepository whatRepository) {
        this.whatRepository = whatRepository;
    }

    @GetMapping(value = "what", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public String what() {
        return whatRepository.random();
    }

}
