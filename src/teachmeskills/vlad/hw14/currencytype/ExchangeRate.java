package teachmeskills.vlad.hw14.currencytype;

import teachmeskills.vlad.hw14.currencytype.Currency;

public class ExchangeRate {
    private Currency currencyType;
    private double course = 0;

    ExchangeRate(Currency currencyType, double course) {
        this.currencyType = currencyType;
        this.course = course;
    }

    public Currency getCurrencyType() {
        return currencyType;
    }

    public double getCourse() {
        return course;
    }
}
