package org.example.consumer;

import org.example.service.CurrencyConverter;
import java.util.Scanner;
import java.util.ServiceLoader;

public class Main {
    public static void main(String[] args)  {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Simple Currency Converter");
        String inputSEK = "";
        boolean isValidInput = false;


        while (!isValidInput) {
            System.out.print("Please enter the amount in SEK: ");
            inputSEK = scanner.nextLine();
            System.out.print("\n");
            try {
                Double.parseDouble(inputSEK);
                isValidInput = true;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number.");
            }
        }

        ServiceLoader<CurrencyConverter> loader = ServiceLoader.load(CurrencyConverter.class);
        for (CurrencyConverter converter : loader) {
            System.out.println(converter.convert(inputSEK));
        }
    }
}