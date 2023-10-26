package com;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class ExerciseServer {
    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(4040)) {
            System.out.println("Server listening on port 4040");
            try (Socket socket = serverSocket.accept()) {
                System.out.println("client connect");
                try (BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()))) {
                    String line;
                    while ((line = in.readLine()) !=null) {
                        System.out.println("Received: " + line);
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
