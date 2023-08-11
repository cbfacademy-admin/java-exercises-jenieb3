package com.cbfacademy;
import com.cbfacademy.Arithmetic;

public class App {
    public static void main ( String[] args ) {
        System.out.println( "Hello World!" );
        float operand1 = 9.6f;
        float operand2 = 17.3f;
        Arithmetic exercises = new Arithmetic();

        System.out.println(exercises.AddFloat(operand2, operand2));
        System.out.println(exercises.SubtractFloat(operand2, operand2));
        System.out.println(exercises.MultiplyFloat(operand2, operand2));
        System.out.println(exercises.DivideFloat(operand2, operand2));
    }
}
