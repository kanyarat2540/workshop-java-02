package testdouble;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import unittest.UserNotFoundException;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class GenerateIdServiceTest {
    @Test
    @DisplayName("Demo Stub Random :: ID= XYZ7")
    public void case01() {
        GenerateIdService generateIdService = new GenerateIdService();
        generateIdService.setRandom(new StubRandom(7));
        String id = generateIdService.get(null);
        assertEquals("XYZ7", id);
    }
}

class StubRandom extends Random {
    private final int number;

    public StubRandom(int number) {
        this.number = number;
    }

    @Override
    public int nextInt(int bound) {
        return number;
    }
}