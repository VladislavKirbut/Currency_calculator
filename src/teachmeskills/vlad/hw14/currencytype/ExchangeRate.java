package teachmeskills.vlad.hw14.currencytype;

import java.math.BigDecimal;

public class ExchangeRate {
    private final Currency CURRENCY_TYPE;
    private final BigDecimal COURSE;

    ExchangeRate(Currency currencyType, BigDecimal course) {
        this.CURRENCY_TYPE = currencyType;
        if (course.compareTo(BigDecimal.ZERO) <= 0)
            throw new IllegalArgumentException("The exchange rate cannot be negative or zero.");
        else this.COURSE = course;
    }

    public Currency getCurrencyType() {
        return CURRENCY_TYPE;
    }

    public BigDecimal getCourse() {
        return COURSE;
    }
}
