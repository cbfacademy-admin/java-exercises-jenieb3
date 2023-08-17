package com.cbfacademy;

import java.util.*;
class InvalidFileNameException extends Exception {
    public InvalidFileNameException(String errormessage) {
        super(errormessage);
    }
}

public class FileExtension {
    public int check(String fileName) throws InvalidFileNameException {
        if (fileName == null || fileName.isEmpty()) {
            throw new InvalidFileNameException("File name cannot be null or empty");
        }

        if (fileName.endsWith(".java")) {
            return 1;
        } else {
            return 0;
        }
    }
}
