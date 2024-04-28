package org.example.consumer;

import org.example.service.CurrencyConverter;
import java.io.IOException;
import java.util.ServiceLoader;

public class Main {
    public static void main(String[] args)  {
        System.out.println("conversion");

        ServiceLoader<CurrencyConverter> loader = ServiceLoader.load(CurrencyConverter.class);
        for (CurrencyConverter converter : loader) {
            System.out.println(converter.convert("convertHello"));
        }
    }
}