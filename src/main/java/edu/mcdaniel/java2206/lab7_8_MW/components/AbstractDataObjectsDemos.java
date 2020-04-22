package edu.mcdaniel.java2206.lab7_8_MW.components;

public class AbstractDataObjectsDemos {
    public static void main(String[] args) {
        String value = "Hello World";
        char[] hwArray = value.toCharArray();

        for(int i=0; i<hwArray.length; ++i){
            System.out.println(hwArray[i]);
        }
    }
}
