package com.example.worksopdip;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class GenerateIdServiceTest {
    // sping boot

    @Autowired
    private GenerateIdService generateIdService;

    @MockBean
    private Random random;

    @Test
    @DisplayName("เริ่มต้นทดสอบ spring boot test")
    public void case01() {
        //Arrange
//        Mockito.when(random.nextInt(10)).thenReturn(7);
        Mockito.when(random.nextInt(Mockito.anyInt())).thenReturn(7);
        //Acc
        String id = generateIdService.get();
        //Assert
        assertEquals("A7", id);
    }

}