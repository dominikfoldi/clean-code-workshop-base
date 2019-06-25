package hu.gyeekclub.workshop;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class IntegerTests {

    @Test
    public void test2x2Is4() {
        int result = 2 * 2;

        int expected = 4;
        assertEquals(result, expected, "2 * 2 should be 4!");
    }
}
