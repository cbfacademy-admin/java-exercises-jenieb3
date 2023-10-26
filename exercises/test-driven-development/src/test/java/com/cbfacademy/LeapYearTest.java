package com.cbfacademy;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.Year;

import org.junit.jupiter.api.Test;

// public class LeapYearTest {
//     // years divisible by 400
//     @Test
//     public void isLeapYear() {

//         assertTrue(Year.isLeap(1600));

//     }

//     @Test
//     public void isNotLeapYear() {
//         assertFalse(Year.isLeap(1500));
//     }
// }
import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class LeapYearTest {

    @ParameterizedTest
    @MethodSource("leapYearProvider")
    public void testIsLeapYear(int year, boolean expected) {
        assertEquals(expected, LeapYear.isLeap(year));
    }

    private static Stream<Arguments> leapYearProvider() {
        return Stream.of(
            Arguments.of(1600, true),
            Arguments.of(1700, false),
            Arguments.of(1800, false),
            Arguments.of(1900, false),
            Arguments.of(2000, true),
            Arguments.of(2001, false),
            Arguments.of(2002, false),
            Arguments.of(2003, false),
            Arguments.of(2004, true),
            Arguments.of(2007, false)
        );
    }
}
