import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


class CurrencyConverter1 { 
    private Map<String, Double> eR;

    public CurrencyConverter1() {
        eR = new HashMap<>();
        eR.put("USD", 1.0);
        eR.put("EUR", 0.85);
        eR.put("GBP", 0.75);
        eR.put("JPY", 110.0);
        eR.put("IDR", 15000.0);

    }


    public double convert(String fromCurrency, String toCurrency, double amount) {
        if (eR.containsKey(fromCurrency) && eR.containsKey(toCurrency)) {
            double amountInUSD = amount / eR.get(fromCurrency);
            return amountInUSD * eR.get(toCurrency);
        } else {
            throw new IllegalArgumentException("Invalid currency.");
        }
    }
}


public class BefoeConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CurrencyConverter converter = new CurrencyConverter();

        System.out.println("Currency Converter");
        System.out.print("Enter the currency you want to convert from (USD, EUR, GBP, JPY, IDR): ");
        String fromCurrency = scanner.nextLine().toUpperCase();

        System.out.print("Enter the currency you want to convert to (USD, EUR, GBP, JPY, IDR): ");
        String toCurrency = scanner.nextLine().toUpperCase();

        System.out.print("Enter the amount to convert: ");
        double amount = scanner.nextDouble();

        try {
            double convertedAmount = converter.convert(fromCurrency, toCurrency, amount);
            System.out.printf("%.2f %s is equal to %.2f %s%n", amount, fromCurrency, convertedAmount, toCurrency);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        scanner.close();
    }
}