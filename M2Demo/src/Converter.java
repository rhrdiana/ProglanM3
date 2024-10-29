import java.util.HashMap;
import java.util.Map;

//rename
//encapsulated fields
//inline variable
//extract method
//Extract interface
//Move Method
class CurrencyConverter implements M2T4.CurrencyConverter1 {
    private Map<String, Double> exchangeRates; //setter getter dan rename

    public CurrencyConverter() {
        setExchangeRates(new HashMap<>());
        getExchangeRates().put("USD", 1.0);
        getExchangeRates().put("EUR", 0.85);
        getExchangeRates().put("GBP", 0.75);
        getExchangeRates().put("JPY", 110.0);
        getExchangeRates().put("IDR", 15000.0);

    }

    @Override
    public double convert(String fromCurrency, String toCurrency, double amount) { //extrac method
        return extracted(fromCurrency, toCurrency, amount);
    }

    @Override
    public Map<String, Double> getExchangeRates() {
        return exchangeRates;
    }

    @Override
    public void setExchangeRates(Map<String, Double> exchangeRates) {
        this.exchangeRates = exchangeRates;
    }
}

// Main class
public class Converter { //Move Method
}
