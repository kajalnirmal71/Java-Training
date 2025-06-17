package demo.basic;

public class CurrencyConverter {


    // Currency exchange rates relative to 1 US dollar
    int rupee = 63;            // 1 USD = 63 Rupees
    int dirham = 3;            // 1 USD = 3 Dirhams
    int _yen = 110;            // 1 USD = 110 Yens
    int $australian = 1;       // 1 USD = 1 Australian Dollar
    int dollar;                // Uninitialized variable, defaults to 0
    int Rupee = 100;           // Different case variable, 1 USD = 100 Rupees (example)

    // Method to convert US Dollars to Indian Rupees
    public int convertToRupees(int usd) {
        return usd * rupee;
    }

    // Method to convert US Dollars to Dirhams
    public int convertToDirhams(int usd) {
        return usd * dirham;
    }

    // Method to convert US Dollars to Yen
    public int convertToYen(int usd) {
        return usd * _yen;
    }

    // Method to convert US Dollars to Australian Dollars
    public int convertToAustralian(int usd) {
        return usd * $australian;
    }

    // Method to convert US Dollars to Rupees (using the Rupee variable)
    public int convertToRupee(int usd) {
        return usd * Rupee;
    }

    // Method to display the currency exchange rates
    public void displayRates() {
        System.out.println("Exchange Rates relative to 1 USD:");
        System.out.println("Rupees: " + rupee);
        System.out.println("Dirhams: " + dirham);
        System.out.println("Yen: " + _yen);
        System.out.println("Australian Dollars: " + $australian);
        System.out.println("Rupee (different case variable): " + Rupee);
    }

    public static void main(String[] args) {
        CurrencyConverter converter = new CurrencyConverter();

        // Display the exchange rates
        converter.displayRates();

        // Example conversions for 10 USD
        int usdAmount = 10;
        System.out.println("\nConversion of " + usdAmount + " USD:");
        System.out.println("To Rupees: " + converter.convertToRupees(usdAmount));
        System.out.println("To Dirhams: " + converter.convertToDirhams(usdAmount));
        System.out.println("To Yen: " + converter.convertToYen(usdAmount));
        System.out.println("To Australian Dollars: " + converter.convertToAustralian(usdAmount));
        System.out.println("To Rupee (different case): " + converter.convertToRupee(usdAmount));
    }
}





