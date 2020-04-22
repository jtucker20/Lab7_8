package edu.mcdaniel.java2206.lab7_8_MW.components;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.logging.LogManager;
import java.util.logging.Logger;



public class Converter {

    //private assets
    private Map<Integer, Double> opens;
    private Map<Integer, Double> highs;
    private Map<Integer, Double> lows;
    private Map<Integer, Double> closes;
    private Map<Integer, Date> dates;
    private Map<Integer, Double> inflationRates;
    private Map<Integer, Date> inflationDates;
    private Logger log = LogManager.getLogger(Converter.class);


    //constructors
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

        // DO the conversion!
        log.info("The value of element 1 in opens map is: {}", this.opens.get(2));

        return result;

    }
}
