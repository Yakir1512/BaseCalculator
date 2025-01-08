package BaseCalculator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;






public class Ex1Test {

    @Test
    void computeNumberTest() {
        String s2 = "1011b2";
        int v = Ex1.converToTen(s2, 2);
        assertEquals(11, v, "Binary. conversion GOO");
        String s10 = "123bA";
        v = Ex1.converToTen(s10, 10);
        assertEquals(123, v, "Decimal conversion good");
        String hex = "1FbG";
        v = Ex1.converToTen(hex, 16);
        assertEquals(31, v, "Decimal conversion good");


    }
    @Test
    void testConvertToTen() {
        String input = "1011b2";
        int result = Ex1.converToTen(input, 2);
        assertEquals(11, result, "Failed to convert binary to decimal");

        input = "A1bG";
        result = Ex1.converToTen(input, 16);
        assertEquals(161, result, "Failed to convert hexadecimal to decimal");

        input = "123bA";
        result = Ex1.converToTen(input, 10);
        assertEquals(123, result, "Failed to convert decimal to decimal");
    }


    @Test
        void isBasisNumberTest() {
            String[] good = {"1b2", "133b4", "649bA", "123bG", "ABbG", "0bA"};
            for(int i=0;i<good.length;i=i+1) {
                boolean ok = Ex1.isNumber(good[i]);
                assertTrue(ok);
            }
            String[] not_good = {"0bbA", "54b2", "1Gs3bG", " SBbG", "3b2", "abB", "!@b2", "A", "1bb2"};
            for(int i=0;i<not_good.length;i=i+1) {
                boolean not_ok = Ex1.isNumber(not_good[i]);
                assertFalse(not_ok);
            }
        }

    @Test
    void testConverToBase() {
        int input = 11;
        String result = Ex1.converToBase(input, 2);
        assertEquals("1011", result, "Failed to convert decimal to binary");

        input = 161;
        result = Ex1.converToBase(input, 16);
        assertEquals("A1", result, "Failed to convert decimal to hexadecimal");

        input = 123;
        result = Ex1.converToBase(input, 10);
        assertEquals("123", result, "Failed to convert decimal to decimal");
    }

    @Test
    void testEquals() {
        String n1 = "1011";
        String n2 = "1011";
        assertTrue(Ex1.equals(n1, n2), "Equality check failed for identical strings");

        n1 = "1010";
        n2 = "1011";
        assertFalse(Ex1.equals(n1, n2), "Equality check failed for different strings");
    }



    }
