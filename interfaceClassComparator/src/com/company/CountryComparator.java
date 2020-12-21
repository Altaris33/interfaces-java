package com.company;

import java.util.Comparator;

public class CountryComparator implements Comparator<Country> {

    @Override
    public int compare(Country country1, Country country2) {
        if (country1.getInhabitantNumber() < country2.getInhabitantNumber()){
            return -1;
        } else if (country1.getInhabitantNumber() > country2.getInhabitantNumber()){
            return 1;
        } else {
            return 0;
        }
    }
}
