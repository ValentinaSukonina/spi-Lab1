package org.example.providers;

import org.example.service.CurrencyConverter;

public class ConverterUSD implements CurrencyConverter {
    public ConverterUSD(){
        System.out.println("ConverterUSD created");
    }
    public String convert(String name) {
        return "1USD = " + name + "SEK";
    }
    //1 US Dollar = 10,92 Swedish Krona

    }

