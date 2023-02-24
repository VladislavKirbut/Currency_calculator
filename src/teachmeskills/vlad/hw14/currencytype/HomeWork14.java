package teachmeskills.vlad.hw14.currencytype;

import java.math.BigDecimal;
import java.util.Scanner;

public class HomeWork14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ExchangeService service = new ExchangeService();

        System.out.println("Choose: ");
        System.out.println("""
                1. getTodayRates()
                2. Exchange()
                """);
        int taskNumber = scanner.nextInt();

        switch (taskNumber) {

            case 1 -> {
                System.out.printf("%s %20s %12s\n", "Currency", "Code", "Course");

                for (ExchangeRate rate: service.getTodayRates()) {
                    System.out.printf("%-24s %-10s %s\n", rate.getCurrencyType().getRussianName(),
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
        }
    }
}
