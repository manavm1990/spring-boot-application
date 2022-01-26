// This can be used in conjunction with or as a replacement for a controller test.

package tech.codefinity.application.hello;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class HelloControllerIntegrationTest {

  @Autowired private TestRestTemplate trt;

  @Test
  public void getHello() throws Exception {
    ResponseEntity<String> resp = trt.getForEntity("/", String.class);
    assertThat(resp.getBody()).isEqualTo("Hello Spring Boot!");
  }
}
