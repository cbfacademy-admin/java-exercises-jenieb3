package com.cbfacademy;

import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class ExerciseClient {
    public static void main(String[] args) {
        try (Socket socket = new Socket("localhost", 4040)) {
            System.out.println("Connected to Server");

            try (BufferedWriter out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()))) {
                String message = "Hello, Server!";
                out.write(message);
                out.newLine();
                out.flush();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

