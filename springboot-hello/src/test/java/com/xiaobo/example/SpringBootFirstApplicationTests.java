package com.xiaobo.example;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import java.net.URL;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class SpringBootFirstApplicationTests {

    @LocalServerPort
    private static int port;

    private static String baseUrl = "http://localhost:";

    @Autowired
    private TestRestTemplate template;

    @Test
    public void contextLoads() {

    }

    @Before
    public void setUp() throws Exception {
        baseUrl = baseUrl + port;
    }

    @Test
    public void testSayHello() throws Exception {

        URL base = new URL(baseUrl + "/rest/first/hello");
        ResponseEntity<String> response = template.getForEntity(base.toString(),
                String.class);
        assertThat(response.getBody(), equalTo("Greetings from Spring Boot!"));
    }


}
