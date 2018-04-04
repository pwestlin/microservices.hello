package nuwestlin.microservices.hello.who;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.inject.Inject;

@RestController
@RequestMapping("/")
public class Controller {

    private final WhoRepository whoRepository;

    @Inject
    public Controller(WhoRepository whoRepository) {
        this.whoRepository = whoRepository;
    }

    @GetMapping(value = "who", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public String what() {
        return whoRepository.random();
    }

}
