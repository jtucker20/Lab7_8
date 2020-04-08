package edu.mcdaniel.java2206.lab7_8.components;

import java.util.HashMap;
import java.util.Map;

public class Demo {
    public static final int MAX_RECURSIONS = 50;

    public String valueMaker(String input, int n){
        System.out.println(input);
        String output = input + "$";
        if(n < MAX_RECURSIONS){
            output = valueMaker(output, n + 1);
        }
        return output;
    }

    public static void main(String[] args) {

        System.out.println("End Result:" + (new Demo()).valueMaker("$", 0));
        Map<String,Integer> stringIntegerMap = new HashMap<>();
        stringIntegerMap.put("First", Integer.valueOf(1));

    }

}
