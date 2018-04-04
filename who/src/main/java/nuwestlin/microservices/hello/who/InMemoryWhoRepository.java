package nuwestlin.microservices.hello.who;

import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

@Repository
public class InMemoryWhoRepository implements WhoRepository {
    private List<String> persons = Arrays.asList("God", "Pete", "Nas", "The King", "Pingu");

    @Override public String random() {
        return persons.get(randomIndex(persons.size()));
    }

    private int randomIndex(int max) {
        return ThreadLocalRandom.current().nextInt(0, max);
    }
}
