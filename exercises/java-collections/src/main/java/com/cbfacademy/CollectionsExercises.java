package com.cbfacademy;

import java.util.*;

public class CollectionsExercises {

    public LinkedList<Integer> useLinkedList() {
        // TODO: create an empty linked list
        LinkedList<Integer> linkedList = new LinkedList<>();
        // - add 4 as the first element of the list
        linkedList.addFirst(4);
        // - then add 5, 6, 8, 2, 9 to the the list
        linkedList.add(5);
        linkedList.add(6);
        linkedList.add(8);
        linkedList.add(2);
        linkedList.add(9);
        // - add another 2 as the last element of the list
        linkedList.addLast(2);
        // - add 4 as the 3rd element of the list
        linkedList.add(2, 4);
        // - invoke the method element() on the list and print the result on the screen

        System.out.println(linkedList.element());
        // - return the list
        return linkedList;
        // throw new RuntimeException("Not implemented");
    }

    public Stack<Integer> useStack() {
        // TODO: create an empty stack
        Stack<Integer> stack = new Stack<>();
        // - add 5, 6, 8, 9 to the the stack
        stack.push(5);
        stack.push(6);
        stack.push(8);
        stack.push(9);
        // - print the first element of the stack on the screen
        System.out.println(stack.firstElement());
        // - print the last element of the stack on the screen
        System.out.println(stack.peek());
        // - invoke the method pop() on the stack and print the result on the screen
        int poppedElement = stack.pop();
        System.out.println(poppedElement);
        // - invoke the push(4) method on the stack
        stack.push(4);
        // - return the stack
        return stack;
        // throw new RuntimeException("Not implemented");

    }

    public ArrayDeque<Integer> useArrayDeque() {
        // TODO: create an empty arrayDeque
        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();
        // - add 5, 6, 8, 9 to the the stack
        arrayDeque.add(5);
        arrayDeque.add(6);
        arrayDeque.add(8);
        arrayDeque.add(9);
        // - print the first element of the queue on the screen
        System.out.println(arrayDeque.getFirst());
        // - print the last element of the queue on the screen
        System.out.println(arrayDeque.getLast());
        // - invoke the method poll() on the queue and print the result on the screen
        int polledElement = arrayDeque.poll();
        System.out.println(polledElement);
        // - invoke the element() method on the queue and print the result on the screen
        int peekedElement = arrayDeque.element();
        System.out.println(peekedElement);
        // - return the queue
        return arrayDeque;
        // throw new RuntimeException("Not implemented");
    }

    public HashMap<Integer, String> useHashMap() {
        // TODO: create an empty hash map
        HashMap<Integer, String> hashMap = new HashMap<>();
        // - add {1, TypeScript} entry to the map
        hashMap.put(1, "TypeScript");
        // - add {2, Kotlin} entry to the map
        hashMap.put(2, "Kotlin");
        // - add {3, Python} entry to the map
        hashMap.put(3, "Python");
        // - add {4, Java} entry to the map
        hashMap.put(4, "Java");
        // - add {5, JavaScript} entry to the map
        hashMap.put(5, "JavaScript");
        // - add {6, Rust} entry to the map
        hashMap.put(6, "Rust");
        // - determine the set of keys from the map and print it on the screen
        Set<Integer> keys = hashMap.keySet();
        Collection<String> values = hashMap.values();
        System.out.println("" + keys + values + hashMap.containsKey(7));
        // - determine the set of keys from the map and print it on the screen

       // boolean containsKey7 = hashMap.containsKey(7);
        //System.out.println("Contains key 7: " + containsKey7);
        // - determine whether the map contains "English" as a language and print the

        // result on the screen
        // - return the map
        return hashMap;
        // throw new RuntimeException("Not implemented");
    }

    public String getName() {
        return "Collections Exercises";
    }
}
