import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CheckTest {
    @Nested
    class AnagramTest {
        @Test
        public void testAnagram_True() {
            assertTrue(Solution.isAnagram("listen", "silent"));
        }

        @Test
        public void testAnagram_False_DifferentLetters() {
            assertFalse(Solution.isAnagram("hello", "world"));
        }

        @Test
        public void testAnagram_False_DifferentLengths() {
            assertFalse(Solution.isAnagram("test", "tests"));
        }

        @Test
        public void testAnagram_WithSpacesAndCase() {
            // Optional: you can normalize case and remove spaces before checking
            String s1 = "Debit Card".replaceAll("\\s+", "").toLowerCase();
            String s2 = "Bad Credit".replaceAll("\\s+", "").toLowerCase();
            assertTrue(Solution.isAnagram(s1, s2));
        }

        @Test
        public void testAnagram_EmptyStrings() {
            assertTrue(Solution.isAnagram("", ""));
        }
    }

    @Nested
    class RomanToIntTest {
        @Test
        @DisplayName("Basic valid numerals")
        void testBasicRomans() {
            assertEquals(1, Solution.romanToInt("I"));
            assertEquals(3, Solution.romanToInt("III"));
            assertEquals(4, Solution.romanToInt("IV"));
            assertEquals(9, Solution.romanToInt("IX"));
            assertEquals(58, Solution.romanToInt("LVIII"));
            assertEquals(1994, Solution.romanToInt("MCMXCIV"));
        }

        @Test
        @DisplayName("Mixed additive and subtractive cases")
        void testMixedPatterns() {
            assertEquals(40, Solution.romanToInt("XL"));
            assertEquals(90, Solution.romanToInt("XC"));
            assertEquals(400, Solution.romanToInt("CD"));
            assertEquals(900, Solution.romanToInt("CM"));
            assertEquals(1984, Solution.romanToInt("MCMLXXXIV"));
        }

        @Test
        @DisplayName("Edge and boundary cases")
        void testEdgeCases() {
            assertEquals(0, Solution.romanToInt(""));
            assertEquals(0, Solution.romanToInt(null));
            assertEquals(3999, Solution.romanToInt("MMMCMXCIX"));
            assertEquals(4000, Solution.romanToInt("MMMM"));
        }

        @Test
        @DisplayName("Invalid or unconventional inputs")
        void testInvalidInputs() {
            assertEquals(0, Solution.romanToInt("ABC"));
            assertEquals(0, Solution.romanToInt("IC"));
            assertEquals(0, Solution.romanToInt("VX"));
        }
    }
}
