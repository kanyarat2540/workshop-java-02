package testdouble;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import unittest.UserNotFoundException;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class GenerateIdServiceTest {
    @Test
    @DisplayName("ID= XYZ7")
    public void case01() {
        GenerateIdService generateIdService = new GenerateIdService();
        generateIdService.random = new Random() {
            @Override
            public int nextInt() {
               return 7;
            }
        };
        String id = generateIdService.get();
        assertEquals("XYZ7", id);
    }
}