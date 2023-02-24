package teachmeskills.vlad.hw14;

import teachmeskills.vlad.hw14.currencytype.Currency;
import teachmeskills.vlad.hw14.currencytype.ExchangeRate;
import teachmeskills.vlad.hw14.currencytype.ExchangeService;

import java.math.BigDecimal;
import java.util.Scanner;

public class HomeWork14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ExchangeService service = new ExchangeService();

        System.out.println("Choose: ");
        System.out.print("""
                1. getTodayRates()
                2. Exchange()
                0. Exit
                """);

        while (true) {
            int taskNumber = scanner.nextInt();

            switch (taskNumber) {
                case 1 -> {
                    System.out.printf("%-24s %-10s %s\n", "Currency", "Code", "Course");

                    for (ExchangeRate rate : service.getTodayRates()) {
                        System.out.printf("%-24s %-10s %f\n", rate.getCurrencyType().getRussianName(),
                                                              rate.getCurrencyType(),
                                                              rate.getCourse());
                    }
                }
                case 2 -> {
                    System.out.println("Enter source currency: ");
                    String sourceCurrency = scanner.next();
                    System.out.println("Enter amount: ");
                    String amount = scanner.next();
                    System.out.println("Enter final currency: ");
                    String finalCurrency = scanner.next();

                    BigDecimal result = service.exchange(Currency.valueOf(sourceCurrency),
                                                         new BigDecimal(amount),
                                                         Currency.valueOf(finalCurrency));

                    System.out.println(finalCurrency + ": " + result);
                }
                case 0 -> System.exit(0);
                default -> System.out.println("This command doesn't exist.");
            }
        }

    }
}
