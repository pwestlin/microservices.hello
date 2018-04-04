package nuwestlin.microservices.hello.saywhat;

import org.junit.Before;
import org.junit.Test;
import org.springframework.test.util.ReflectionTestUtils;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class InMemoryWhatRepositoryTest {

    private InMemoryWhatRepository repository = new InMemoryWhatRepository();
    private List<String> whats = Arrays.asList("Yo", "Hello", "Hey");

    @Before
    public void init() {
        ReflectionTestUtils.setField(repository, "whats", whats);
    }

    @Test
    public void random() {
        for (int i = 0; i < 1000; i++) {
            assertThat(whats.contains(repository.random())).isTrue();
        }
    }
}