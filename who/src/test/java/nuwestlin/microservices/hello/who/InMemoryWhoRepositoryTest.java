package nuwestlin.microservices.hello.who;

import org.junit.Before;
import org.junit.Test;
import org.springframework.test.util.ReflectionTestUtils;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.hamcrest.CoreMatchers.is;

public class InMemoryWhoRepositoryTest {

    private InMemoryWhoRepository repository = new InMemoryWhoRepository();
    private List<String> persons = Arrays.asList("Peter", "Pingu", "Ronnie");

    @Before
    public void init() {
        ReflectionTestUtils.setField(repository, "persons", persons);
    }

    @Test
    public void random() {
        for (int i = 0; i < 1000; i++) {
            assertThat(persons.contains(repository.random())).isTrue();
        }
    }
}