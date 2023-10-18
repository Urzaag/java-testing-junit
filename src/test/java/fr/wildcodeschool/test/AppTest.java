package fr.wildcodeschool.test;

import fr.wildcodeschool.unittesting.StringUtils;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Unit test for simple App.
 */
public class AppTest {

//    @Test
//    void vowelFirstTest() {
//        String word = "endroit";
//        assertEquals("eoi", StringUtils.vowels(word));
//    }
//
//    @Test
//    void oneLetterTest() {
//        assertEquals("e", StringUtils.vowels("e"));
//    }
//
//    @Test
//    void nullTest() {
//        assertEquals(null, StringUtils.vowels(null));
//    }

    @Test
    void sameVowelsTest() {
        String message = "eeee";
        assertEquals("e", StringUtils.uniqueVowels(message));
    }

    @Test
    void nullTest() {
        assertEquals(null, StringUtils.uniqueVowels(null));
    }

    @Test
    void alternateVowelsTest() {
        String message = "eaea";
        assertEquals("ea", StringUtils.uniqueVowels(message));
    }

    @Test
    void consecutiveVowelsTest() {
        String message = "eeaa";
        assertEquals("ea", StringUtils.uniqueVowels(message));
    }

    @Test
    void casingVowelsTest() {
        String message = "EeAa";
        assertEquals("ea", StringUtils.uniqueVowels(message));
    }
}
