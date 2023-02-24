package teachmeskills.vlad.hw14.currencytype;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class ExchangeService {

    public ExchangeRate [] getTodayRates() {
        ExchangeRate usd = new ExchangeRate(Currency.USD, new BigDecimal("2.7981"));
        ExchangeRate eur = new ExchangeRate(Currency.EUR, new BigDecimal("2.9769"));
        ExchangeRate gbp = new ExchangeRate(Currency.GBP, new BigDecimal("3.3798"));
        ExchangeRate rub = new ExchangeRate(Currency.RUB, new BigDecimal("0.037604"));
        ExchangeRate cny = new ExchangeRate(Currency.CNY, new BigDecimal("0.40730"));
        ExchangeRate byn = new ExchangeRate(Currency.BYN, new BigDecimal("1.0"));

        return new ExchangeRate[] {usd, eur, gbp, rub, cny, byn};
    }

    public BigDecimal exchange(Currency fromCurrency, BigDecimal amount, Currency toCurrency) {
        if (amount.compareTo(BigDecimal.ZERO) <= 0)
            throw new IllegalArgumentException("You entered negative amount.");

        if (fromCurrency == toCurrency)
            return amount;

        ExchangeRate[] todayRates = this.getTodayRates();
        BigDecimal resultCurrency = amount;

        for (int i = 0; i < todayRates.length; i++) {
            if (todayRates[i].getCurrencyType() == fromCurrency) {
                resultCurrency = resultCurrency.multiply(todayRates[i].getCourse());
                break;
            }
        }

        for (int i = 0; i < todayRates.length; i++)
            if (todayRates[i].getCurrencyType() == toCurrency)
                resultCurrency = resultCurrency.divide(todayRates[i].getCourse(), 10, RoundingMode.HALF_UP);

        return resultCurrency;
    }
}
