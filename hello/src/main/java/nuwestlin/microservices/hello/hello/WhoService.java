package nuwestlin.microservices.hello.hello;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name="${whoservice.name}")
//@RibbonClient(name="${whoservice.name}")
public interface WhoService {

    @GetMapping("/who")
    String who();
}
