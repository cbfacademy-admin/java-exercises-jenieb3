package com.cbfacademy;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
    public List<String> fizzBuzz(List<Integer> numbers) {
         // TODO - Implement this method such that
        // it creates a list where for each element of the input list ${numbers}
        List<String> fbArrayList = new ArrayList<>();

        for (Integer x : numbers) {
            if ((x % 3 == 0) && (x % 5 == 0)) {
                // - if the ${element} is divisible by both 3 and 5, it adds "FizzBuzz" to the
                // list
                fbArrayList.add("FizzBuzz");
            } else if ((x % 3 == 0)) {
                // - if the ${element} is divisible by 3, it adds "Fizz" to the list
                fbArrayList.add("Fizz");
            } else if ((x % 5 == 0)) {
                // - if the ${element} is divisible by 5, it adds "Buzz" to the list
                fbArrayList.add("Buzz");
            } else {
                // - it adds the element to the list in any other case
                fbArrayList.add(x.toString());
            }
        }
        // - it returns the constructed list
        return fbArrayList;
        //throw new RuntimeException("Not implemented");
        
    }
}
    
    

