package org.example.providers;

import org.example.service.CurrencyConverter;

public class ConverterUSD implements CurrencyConverter {
    public ConverterUSD(){
        System.out.println("SEK converted to USD");
    }

    @Override
    public String convert(String inputSEK) {
        double doubleInputSEK = Double.parseDouble(inputSEK);
        double usd = doubleInputSEK / 10.92; // 1 usd = 10.92 sek
        String formatUsd = String.format("%.2f USD", usd);
        return inputSEK + " SEK = " + formatUsd;
    }
}

