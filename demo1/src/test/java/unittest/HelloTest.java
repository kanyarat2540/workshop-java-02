package unittest;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HelloTest {

    @Test
    @DisplayName("นี่คือ case แรกขแงการเขียนนะ")
    public void case01(){
        // Arrange == Given == Pre Condition
        Hello hello = new Hello();
        // Act == When == Action == Call target method
        String actualresult = hello.hi("kanyarat");
        // Assert == Validate with expected result
        assertEquals("Hello kanyarat", actualresult);
    }
}