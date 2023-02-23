package teachmeskills.vlad.hw14.currencytype;

public class ExchangeService {

    public ExchangeRate [] getTodayRates() {
        ExchangeRate usd = new ExchangeRate(Currency.USD, 2.7981);
        ExchangeRate eur = new ExchangeRate(Currency.EUR, 2.9769);
        ExchangeRate gbp = new ExchangeRate(Currency.GBP, 3.3798);
        ExchangeRate rub = new ExchangeRate(Currency.RUB, 3.7604);
        ExchangeRate cny = new ExchangeRate(Currency.CNY, 4.0730);

        return new ExchangeRate[] {usd, eur, gbp, rub, cny};
    }
}
