import org.example.service.CurrencyConverter;
import org.example.providers.ConverterEUR;
import org.example.providers.ConverterUSD;

module provider {
    requires org.example.service;
    opens org.example.providers to org.example.consumer;
    provides CurrencyConverter with ConverterEUR, ConverterUSD;
}