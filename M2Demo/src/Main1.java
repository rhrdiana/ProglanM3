import java.util.Scanner;

public class Main1 {
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

        try { //inline
            System.out.printf("%.2f %s is equal to %.2f %s%n", amount, fromCurrency, converter.convert(fromCurrency, toCurrency, amount), toCurrency);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        scanner.close();
    }
}
