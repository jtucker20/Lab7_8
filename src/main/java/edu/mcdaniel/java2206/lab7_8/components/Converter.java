package edu.mcdaniel.java2206.lab7_8.components;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.format.datetime.DateFormatter;

import java.util.*;

public class Converter {

    //Private Assets
    private Map<Integer, Double> opens;
    private Map<Integer, Double> highs;
    private Map<Integer, Double> lows;
    private Map<Integer, Double> closes;
    private Map<Integer, Date> dates;
    private Map<Integer, Double> inflationRates;
    private Map<Integer, Date> inflationDates;
    private Logger log = LogManager.getLogger(Converter.class);

    //Constructors
    public Converter(){

        //This is NOT actually required.
        this.opens = new HashMap<>();
        this.highs = new HashMap<>();
        this.lows = new HashMap<>();
        this.closes = new HashMap<>();
        this.dates = new HashMap<>();
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
    }

    public void inputInflationData(Map<Integer, Double> inflationRates,
                                   Map<Integer, Date> inflationDates) {
        this.inflationRates = inflationRates;
        this.inflationDates = inflationDates;
        // You should save this information
    }

    public List<String> getConvertedInflationInfo() {
        List<String> result = new ArrayList<>();

        Set<Map.Entry<Integer, Double>> inflationSet =this.inflationRates.entrySet();

        for (Map.Entry<Integer, Double> inflationEntry : inflationSet) {

            int key = inflationEntry.getKey();

            double infRate = this.inflationRates.get(key); // infEntry.getValue();

            Date infDate = this.inflationDates.get(key);//



            String lineValue = "On " + infDate.toString() + " , the inflation rate was " + infRate + ".";

            result.add(lineValue);
        }

        // DO the CONVERSION!

        return result;
    }

    public List<String> getConvertedDowInfo() {
        List<String> result = new ArrayList<>();

        Set<Map.Entry<Integer, Double>> openSet = opens.entrySet();

        for (Map.Entry<Integer, Double> opensEntry : openSet) {

            int key = opensEntry.getKey();

            double open = this.opens.get(key); //opensEntry.getValue();
            double high = this.highs.get(key);
            double low = this.lows.get(key);
            double close = this.closes.get(key);
            Date date = this.dates.get(key);

            String lineValue = " On " + date.toString() + ", the Open was " + open + ", the High was " + high +
                    ", the Low was " + low + ", and the Close was " + close + ". \n";

            result.add(lineValue);
        }

        return result;

    }
}
