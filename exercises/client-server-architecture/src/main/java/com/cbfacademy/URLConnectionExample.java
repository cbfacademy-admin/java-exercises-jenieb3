package com.cbfacademy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class URLConnectionExample {
    public static void main(String[] args) {
        try {
            URL myURL = new URL("https://codingblackfemales.com/");
            URLConnection myURLConnection = myURL.openConnection();
            myURLConnection.connect();
            String contentType = myURLConnection.getContentType();
            System.out.println("Content Type: " + contentType);

            if(myURLConnection instanceof HttpURLConnection) {
                try(BufferedReader in = new BufferedReader(new InputStreamReader(myURLConnection.getInputStream()))) {
                    String inputLine;
                    while ((inputLine = in.readLine()) != null) 
                        System.out.println(inputLine);
                }
            }
            
        } catch (MalformedURLException e) {
            System.out.println("Invalid URL: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error in connection: " + e.getMessage());
        }
    }
}
