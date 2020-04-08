package edu.mcdaniel.java2206.lab7_8.components;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Demo {
    //public static final int MAX_RECURSIONS = 50; //replaced by int p in printSymbolPyramid()

    public void printSymbolPyramid(Boolean upsideDown, String symbol,  int p) {  //Do you want the pyramid to be upside-down?
        String line = "";                                                        //What symbol do you want to be the "bricks" in the pyramid?
        for(int i = 0; i < p; i++){                                              //How many layers do you want the pyramid to have?
            line += symbol;
        }
        if(p>0) {  //prevents infinite loop
            if (upsideDown) {
                System.out.println(line);
                printSymbolPyramid(true, symbol, p - 1);
            }
            else {
                printSymbolPyramid(false, symbol, p - 1);
                System.out.println(line);
            }
        }
    }

//    public String valueMaker(String input, int n){ //replaced by printSymbolPyramid
//        System.out.println(input);
//        String output = input + "$";
//        if(n < MAX_RECURSIONS){
//            output = valueMaker(output, n + 1);
//        }
//        return output;
//    }

    public static void main(String[] args) {
        Demo demo = new Demo();
        //System.out.println("End Result:" + demo.valueMaker("$", 0));
        demo.printSymbolPyramid(false, "$", 50);
        System.out.println();
        demo.printSymbolPyramid(true, "%", 250);
        Map<String, Integer> strIntMap = new HashMap<>();
        strIntMap.put("First", 1);
        strIntMap.put("Second", 2);
        strIntMap.put("Third", 3);
        strIntMap.put("Fourth", 4);

        //for(int i = 1; i < strIntMap.size(); i++){
       //   doen't really work because we have a group of Strings as the indices/pinters/whatever
        //}

        Set<Map.Entry<String, Integer>> entrySet = strIntMap.entrySet();

        for(Map.Entry<String, Integer> entry : entrySet){
            System.out.println("Place : " + entry.getKey() + " is held by runner number " + entry.getValue());
        }

       // Iterator<Map.Entry<String, Integer>> iterator = strIntMap.entrySet().iterator();
        //while(iterator.hasNext()){
        //    MapEntry<String, Integer> currValue = iterator.next()
        //}
    }
}
