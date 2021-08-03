package com.example.worksopdip;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
public class GenerateIdServiceUnitTest {

    @Mock
    private Random random;

    @Test
    @DisplayName("เริ่มต้นทดสอบ mockito + Junit5")
    public void case01() {
        //Arrange
        GenerateIdService generateIdService = new GenerateIdService();
        generateIdService.setRandom(random);
        Mockito.when(random.nextInt(Mockito.anyInt())).thenReturn(7);
        //Acc
        String id = generateIdService.get();
        //Assert
        assertEquals("A7", id);
    }
}