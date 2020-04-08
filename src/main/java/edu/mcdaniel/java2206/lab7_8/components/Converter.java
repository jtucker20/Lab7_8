package edu.mcdaniel.java2206.lab7_8.components;

import org.springframework.format.datetime.DateFormatter;

import java.util.*;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class Converter {

    //Private assets
    private Map<Integer, Double> opens;
    private Map<Integer, Double> highs;
    private Map<Integer, Double> lows;
    private Map<Integer, Double> closes;
    private Map<Integer, Date> dates;
    private Map<Integer, Double> inflationRates;
    private Map<Integer, Date> inflationDates;
    private Logger log = LogManager(String("message") , Double());


    //Constructors
    public Converter(){
        // This is an added thing that is frequently done
        this.opens = new HashMap<>();
        this.highs = new HashMap<>();
        this.lows = new HashMap<>();
        this.closes = new HashMap<>();
        this.inflationRates = new HashMap<>();
        this.inflationDates = new HashMap<>();
    }

    public void inputDowData(Map<Integer, Double> opens,
                             Map<Integer, Double> highs,
                             Map<Integer, Double> lows,
                             Map<Integer, Double> closes,
                             Map<Integer, Date> dates) {
        this.opens = opens;
        this.highs = highs;
        this.lows = lows;
        this.closes = closes;
        this.dates = dates;
        this.inflationRates = null;
        this.inflationDates = null;
        // You should save this information
    }

    public void inputInflationData(Map<Integer, Double> inflationRates,
                                   Map<Integer, Date> inflationDates) {

        // You should save this information
    }

    public List<String> getConvertedInflationInfo() {
        List<String> result = new ArrayList<>();

        // DO the CONVERSION!

        return result;
    }

    public List<String> getConvertedDowInfo() {
        List<String> result = new ArrayList<>();

        Set<Map.Entry<Integer, Double>> openSet = opens.entrySet();


        for (Map.Entry<Integer, Double> opensEntry : openSet){
            int key = opensEntry.getKey();

            double open = opensEntry.getValue();
            double high = this.highs.get(key);
            double low = this.lows.get(key);
            double close = this.closes.get(key);
            Date date = this.dates.get(key);

            DateFormatter dateFormatter = new DateFormatter();
            dateFormatter.setPattern("MM/dd/yyyy");

            String lineValue = "On" + dateFormatter.print(date, Locale.ENGLISH) + (", the Open value was ") +
                String.format("%.2f",open) + ", the High value was " + high + ", the Low value was " +
                low + ", and the Close value was " + close + ".";
        // DO the conversion!

            log("")
            result.add(lineValue);

    }
        return result;
}
