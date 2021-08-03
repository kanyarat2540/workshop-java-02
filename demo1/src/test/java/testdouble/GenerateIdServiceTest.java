package testdouble;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

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

    @Test
    @DisplayName("Demo Spy Random :: Called nextInt()")
    public void case02() {
        GenerateIdService service = new GenerateIdService();
        SpyRandom spyRandom = new SpyRandom();
        service.setRandom(spyRandom);
        service.get(null);
        spyRandom.verify(1);
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


class SpyRandom extends Random {
    private int counter = 0;

    @Override
    public int nextInt(int bound) {
        this.counter++;
        return 100000;
    }

    public void verify(int expectedCount) {
        if (expectedCount != counter) {
            fail("จำนวนการเรียกใช้งาน method nextInt() ไม่ถูกต้อง");
        }
    }
}