package nuwestlin.microservices.hello.saywhat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SaywhatApplication {

    public static void main(String[] args) {
        SpringApplication.run(SaywhatApplication.class, args);
    }
}
