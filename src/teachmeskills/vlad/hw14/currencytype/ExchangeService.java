package teachmeskills.vlad.hw14.currencytype;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class ExchangeService {

    private static final Currency BASE_CURRENCY = Currency.BYN;
    private static final BigDecimal RATE_OF_BASE_CURRENCY = BigDecimal.ONE;

    public ExchangeRate [] getTodayRates() {
        ExchangeRate usd = new ExchangeRate(Currency.USD, new BigDecimal("2.7981"));
        ExchangeRate eur = new ExchangeRate(Currency.EUR, new BigDecimal("2.9769"));
        ExchangeRate gbp = new ExchangeRate(Currency.GBP, new BigDecimal("3.3798"));
        ExchangeRate rub = new ExchangeRate(Currency.RUB, new BigDecimal("0.037604"));
        ExchangeRate cny = new ExchangeRate(Currency.CNY, new BigDecimal("0.40730"));

        return new ExchangeRate[] {usd, eur, gbp, rub, cny};
    }

    public BigDecimal exchange(Currency fromCurrency, BigDecimal amount, Currency toCurrency) {
        if (amount.compareTo(BigDecimal.ZERO) < 0)
            throw new IllegalArgumentException("You entered negative amount.");

        if (fromCurrency == toCurrency)
            return amount;

        ExchangeRate[] todayRates = this.getTodayRates();

        BigDecimal bynCurrency = amount.multiply(getRate(todayRates, fromCurrency));
        return bynCurrency.divide(getRate(todayRates, toCurrency), 10, RoundingMode.HALF_UP);
    }

    public static BigDecimal getRate(ExchangeRate[] todayRates, Currency currency) {
        if (currency == BASE_CURRENCY)
            return RATE_OF_BASE_CURRENCY;

        for (int i = 0; i < todayRates.length; i++)
            if (todayRates[i].getCurrencyType() == currency)
                return todayRates[i].getCourse();

        throw new IllegalArgumentException("Incorrect parameters");
    }
}
