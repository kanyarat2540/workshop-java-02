package com.example.worksopdip;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class IdControllerTest {

    @Autowired
    TestRestTemplate restTemplate;

    @Test
    @DisplayName(" ทดสอบ Rest API / id")
    public  void case01 (){
        IDResponse res = restTemplate.getForObject("/id", IDResponse.class);
        assertEquals("AA", res.getResult());
    }

}