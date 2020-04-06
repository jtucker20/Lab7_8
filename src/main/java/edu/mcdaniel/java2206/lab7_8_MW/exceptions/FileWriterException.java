package edu.mcdaniel.java2206.lab7_8_MW.exceptions;

import java.io.IOException;

public class FileWriterException extends RuntimeException {

    public FileWriterException(String s, IOException ioe) {
        super(s, ioe);
    }
}
