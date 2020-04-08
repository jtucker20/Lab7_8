package edu.mcdaniel.java2206.lab7_8.components;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.format.datetime.DateFormatter;

import java.util.*;

public class Converter {

    //private assets
    private Map<Integer, Double> opens; //private pointer(s) to map(s) to data passed in next method as pointer(s). Java: not copying objects, copying pointers
    private Map<Integer, Double> highs;
    private Map<Integer, Double> lows;
    private Map<Integer, Double> closes;
    private Map<Integer, Date> dates;
    private Map<Integer, Double> inflationRates;
    private Map<Integer, Date> inflationDates;
    private Logger log = LogManager.getLogger(Converter.class);
    private DateFormatter dateFormatter = new DateFormatter();

    public Converter(){
        this.opens = new HashMap<>();
        this.highs = new HashMap<>();
        this.lows = new HashMap<>();
        this.closes = new HashMap<>();
        this.dates = new HashMap<>();
        this.inflationRates = new HashMap<>();
        this.inflationDates = new HashMap<>();
    }
    public void setDatePattern(String pattern){  //set different patterns for different use-cases locally
        try {
            this.dateFormatter.setPattern(pattern);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    public void inputDowData(Map<Integer, Double> opens,
                             Map<Integer, Double> highs,
                             Map<Integer, Double> lows,
                             Map<Integer, Double> closes,
                             Map<Integer, Date> dates) {

        // You should save this information
        this.opens = opens;
        this.highs = highs;
        this.lows = lows;
        this.closes = closes;
        this.dates = dates;
    }

    public void inputInflationData(Map<Integer, Double> inflationRates,
                                   Map<Integer, Date> inflationDates) {

        // You should save this information
        this.inflationRates = inflationRates;
        this.inflationDates = inflationDates;
    }

    public List<String> getConvertedInflationInfo() {
        List<String> result = new ArrayList<>();
        this.setDatePattern("yyyy");  //changed to reflect that the information written to file corresponds to average yearly values in csv

        int j = 0;
        while(this.inflationDates.get(j) == null){ //prevents NullPointerException....
            j++;
        }
        for(int i = j; i < this.inflationRates.size() + j; i++) { //....without hard-coding the line at which the actual data in the csv starts
            Date date = this.inflationDates.get(i);
            Double rate = this.inflationRates.get(i);
            result.add("In " + dateFormatter.print(date, Locale.ENGLISH)
                    + ", the average Inflation Rate was " + rate + ".\n"); //contents of file will not be jammed into a single line
        }
        return result;
    }

    public List<String> getConvertedDowInfo() {
        List<String> result = new ArrayList<>();
        this.dateFormatter.setPattern("MM/dd/yyyy");

        int j = 0;
        while(this.opens.get(j) == null){ //prevents NullPointerException....
            j++;
        }
        for(int i = j; i < this.opens.size() + j; i++) { //....without hard-coding the line at which the actual data in the csv starts
            double open = this.opens.get(i);
            double high = this.highs.get(i);
            double low = this.lows.get(i);
            double close = this.closes.get(i);
            Date date = this.dates.get(i);

            String lineValue = "On "
                    + dateFormatter.print(date, Locale.ENGLISH)
                    + ", the Open value was " + open
                    + ", the High value was " + high
                    + ", the Low value was " + low
                    + ", and the Close value was " + close + ".\n";  //contents of file will not be jammed into a single line
            result.add(lineValue);
        }
        return result;
        /*
        Set<Map.Entry<Integer, Double>> openSet = opens.entrySet(); //turns map into set, which allows you to loop through keys. "Enhanced for loop"


        "Enhanced For-Loop" Method
        for(Map.Entry<Integer, Double> opensEntry : openSet){
            int key = opensEntry.getKey();
            double open = this.opens.get(key);
            double high = this.highs.get(key);
            double low = this.lows.get(key);
            double close = this.closes.get(key);
            Date date = this.dates.get(key);

            DateFormatter dateFormatter = new DateFormatter();
            dateFormatter.setPattern("MM/dd/yyyy");

            String lineValue = "On "
                    + dateFormatter.print(date, Locale.ENGLISH)
                    + ", the Open value was " + open
                    + ", the High value was " + high
                    + ", the Low value was " + low
                    + ", and the Close value was " + close + ".";
            temp.add(lineValue);
            log.info("For line {}, the Value is {}", key, lineValue);
        }

        return result;
        */
    }
}
