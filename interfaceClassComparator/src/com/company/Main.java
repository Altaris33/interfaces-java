package com.company;

public class Main {

    public static void main(String[] args) {

        Country country1 = new Country(100000);
        Country country2 = new Country(180500);

        System.out.println(new CountryComparator().compare(country1, country2));
    }
}
