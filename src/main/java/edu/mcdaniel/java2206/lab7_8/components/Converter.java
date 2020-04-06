package edu.mcdaniel.java2206.lab7_8.components;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

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

    public Converter(){
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
    }

    public List<String> getConvertedInflationInfo() {
        List<String> result = new ArrayList<>();

        // DO the CONVERSION!

        return result;
    }

    public List<String> getConvertedDowInfo() {
        List<String> result = new ArrayList<>();

        log.info("The first value in the opens map is : {}", this.opens.get(2));
        // DO the conversion!

        return result;

    }
}
