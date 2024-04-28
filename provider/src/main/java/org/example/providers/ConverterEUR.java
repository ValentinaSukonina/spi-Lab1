package org.example.providers;

import org.example.service.CurrencyConverter;

public class ConverterEUR implements CurrencyConverter {
    public ConverterEUR(){
        System.out.println("SEK converted to EUR");
    }

    @Override
    public String convert(String inputSEK) {
        double doubleInputSEK = Double.parseDouble(inputSEK);
        double euros = doubleInputSEK / 11.68;  // 1 EUR = 11.68 SEK
        String formatEuro = String.format("%.2f EUR", euros);
        return inputSEK + " SEK = " + formatEuro;
    }
}
