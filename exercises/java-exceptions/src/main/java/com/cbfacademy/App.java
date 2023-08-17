package com.cbfacademy;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
       List<String> fileNames = Arrays.asList("App.java", "App.txt", "", null, "App.md");
        FileExtension fileExtensionChecker = new FileExtension();
        Map<String, Integer> resultMap = new HashMap<>();
        for (String fileName : fileNames) {
            try {
                int result;
                if (fileName == null || fileName.isEmpty()) {
                    result = -1;
                } else {
                    result = fileExtensionChecker.check(fileName);
                }
                resultMap.put(fileName, result);
                } catch (InvalidFileNameException e) {
                    resultMap.put(fileName, -1);
                }
            }
            for (Map.Entry<String,Integer> entry : resultMap.entrySet()) {
            System.out.println("{" + entry.getKey() + ", " + entry.getValue() + "}" );    
            }
        }
    }
        
    
    
        
    

