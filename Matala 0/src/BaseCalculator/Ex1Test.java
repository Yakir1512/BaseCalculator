package BaseCalculator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;






public class Ex1Test {

    @Test
    void computeNumberTest() {
        String s2 = "1011b2";
        int v = Ex10.converToTen(s2, 2);
        assertEquals(11, v, "Binary. conversion GOO");
        String s10 = "123bA";
        v = Ex10.converToTen(s10, 10);
        assertEquals(123, v, "Decimal conversion good");
        String hex = "1FbG";
        v = Ex10.converToTen(hex, 16);
        assertEquals(31, v, "Decimal conversion good");


    }
    @Test
    void testConvertToTen() {
        String input = "1011b2";
        int result = Ex10.converToTen(input.split("b")[0], 2);
        assertEquals(11, result, "Failed to convert binary to decimal");

        input = "A1b16";
        result = Ex10.converToTen(input.split("b")[0], 16);
        assertEquals(161, result, "Failed to convert hexadecimal to decimal");

        input = "123b10";
        result = Ex10.converToTen(input.split("b")[0], 10);
        assertEquals(123, result, "Failed to convert decimal to decimal");
    }


    @Test
        void isBasisNumberTest() {
            String[] good = {"1b2", "133b4", "649bA", "123bG", "ABbG", "0bA"};
            for(int i=0;i<good.length;i=i+1) {
                boolean ok = Ex10.isNumber(good[i]);
                assertTrue(ok);
            }
            String[] not_good = {"0bbA", "54b2", "1Gs3bG", " SBbG", "3b2", "abB", "!@b2", "A", "1bb2"};
            for(int i=0;i<not_good.length;i=i+1) {
                boolean not_ok = Ex10.isNumber(not_good[i]);
                assertFalse(not_ok);
            }
        }

    @Test
    void testConverToBase() {
        int input = 11;
        String result = Ex10.converToBase(input, 2);
        assertEquals("1011", result, "Failed to convert decimal to binary");

        input = 161;
        result = Ex10.converToBase(input, 16);
        assertEquals("A1", result, "Failed to convert decimal to hexadecimal");

        input = 123;
        result = Ex10.converToBase(input, 10);
        assertEquals("123", result, "Failed to convert decimal to decimal");
    }
    @Test
    void testEquals() {
        String n1 = "1011";
        String n2 = "1011";
        assertTrue(Ex10.equals(n1, n2), "Equality check failed for identical strings");

        n1 = "1010";
        n2 = "1011";
        assertFalse(Ex10.equals(n1, n2), "Equality check failed for different strings");
    }



    }
