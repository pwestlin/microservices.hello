package nuwestlin.microservices.hello.hello;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import javax.inject.Inject;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(controllers = Controller.class)
public class ControllerTest {

    @Inject private MockMvc mvc;

    @MockBean
    WhoService whoService;

    @MockBean
    WhatService whatService;

    @Test
    public void hello() throws Exception {
        String what = "Yo";
        when(whatService.what()).thenReturn(what);

        String who = "Nas";
        when(whoService.who()).thenReturn(who);

        this.mvc.perform(get("/hello")
            .accept(MediaType.APPLICATION_JSON))
            .andExpect(status().isOk())
            .andExpect(content().string(what + ", " + who + "!"));
    }
}