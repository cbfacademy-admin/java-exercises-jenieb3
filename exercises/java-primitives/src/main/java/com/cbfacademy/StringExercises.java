package com.cbfacademy;

import javax.xml.stream.events.Characters;

public class StringExercises {

    public String fromCharacters(char[] characters) {
        // TODO - Write code that creates a String from the input array of characters
        return new String(characters);
    }
    // throw new RuntimeException("Not implemented");

    public Long howMany(String text, Character character) {
        // TODO - Write code to determine how many of the input ${character} are
        // contained in the input ${text}
        long count = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == character) {
                count++;
            }
        }
        return count;
        // throw new RuntimeException("Not implemented");
    }

    public Boolean isPalindrome(String word) {
        // TODO - Write code to determine whether the input ${word} is a palindrome
        int left = 0;
        int right = word.length() - 1;

        while (left < right) {
            if (word.charAt(left) != word.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
    // throw new RuntimeException("Not implemented");

    public String getName() {
        return "String Exercises";
    }
}
