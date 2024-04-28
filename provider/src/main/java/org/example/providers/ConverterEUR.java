package org.example.providers;

import org.example.service.CurrencyConverter;

public class ConverterEUR implements CurrencyConverter {
    public ConverterEUR(){
        System.out.println("ConverterEUR created");
    }

    @Override
    public String convert(String name) {
        return "1EURO = " + name + "SEK";
    }
    //1,00 Euro = 11,68 Swedish Krona
}
