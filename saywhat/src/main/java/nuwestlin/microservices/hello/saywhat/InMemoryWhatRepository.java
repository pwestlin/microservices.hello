package nuwestlin.microservices.hello.saywhat;

import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

@Repository
public class InMemoryWhatRepository implements WhatRepository {
    private List<String> whats = Arrays.asList("Yo", "Hello", "Good morning", "How are you doing", "Hey");

    @Override public String random() {
        return whats.get(randomIndex(whats.size()));
    }

    private int randomIndex(int max) {
        return ThreadLocalRandom.current().nextInt(0, max);
    }
}
