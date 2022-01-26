package tech.codefinity.application.hello;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

// Just test ✅ the web layer
@WebMvcTest
@AutoConfigureMockMvc
class HelloControllerTest {

  @Autowired private MockMvc mock;

  @Test
  public void getHello() throws Exception {

    mock.perform(MockMvcRequestBuilders.get("/").accept(MediaType.APPLICATION_JSON))
        .andExpect(status().isOk())
        .andExpect(content().string("Hello Spring Boot!"));
  }
}
