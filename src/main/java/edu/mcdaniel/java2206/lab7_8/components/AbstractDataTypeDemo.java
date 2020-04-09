package edu.mcdaniel.java2206.lab7_8.components;

import jdk.internal.loader.Resource;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class AbstractDataTypeDemo {

    public static void main(String[] args) {
        List<File> fileList = new ArrayList<>();
        File file = new File(new AbstractDataTypeDemo().ClassLoader().getResource("InfRate.csv").getFile());
    }

    private Resource ClassLoader() {
        return null;
    }

}
