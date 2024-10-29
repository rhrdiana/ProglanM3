package M2T4;

import java.util.Map;

public interface CurrencyConverter1 {
    double convert(String fromCurrency, String toCurrency, double amount);

    default double extracted(String fromCurrency, String toCurrency, double amount) {
        if (getExchangeRates().containsKey(fromCurrency) && getExchangeRates().containsKey(toCurrency)) {
            double amountInUSD = amount / getExchangeRates().get(fromCurrency);
            return amountInUSD * getExchangeRates().get(toCurrency);
        } else {
            throw new IllegalArgumentException("Invalid currency.");
        }
    }

    Map<String, Double> getExchangeRates();

    void setExchangeRates(Map<String, Double> exchangeRates);
}
