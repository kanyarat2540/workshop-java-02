package com.example.worksopdip;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class GenerateIdServiceTest {
    // sping boot

    @Autowired
    private  GenerateIdService generateIdService;

    @Test
    @DisplayName("เริ่มต้นทดสอบ spring boot test")
    public void case01() {
    String id  =generateIdService.get();
    assertEquals("A7",id);
    }

}