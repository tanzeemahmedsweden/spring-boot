package org.tanzeem.springboot;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.net.ConnectException;

public class HelloControllerTest {

    public static final String URI = "http://localhost:8081";
    private RestTemplate restTemplate = new RestTemplate();

    @Test(enabled = false, expectedExceptions = ConnectException.class)
    public void testHelloController() {
        final ResponseEntity<String> responseEntity = restTemplate.getForEntity(URI, String.class);

        final String response = responseEntity.getBody();
        final HttpStatus statusCode = responseEntity.getStatusCode();

        Assert.assertEquals(response, "Greeting from Spring Boot!");
        Assert.assertEquals(statusCode, HttpStatus.OK);
    }
}
