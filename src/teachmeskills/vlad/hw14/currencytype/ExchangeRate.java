package teachmeskills.vlad.hw14.currencytype;

import java.math.BigDecimal;

public class ExchangeRate {
    private final Currency currencyType;
    private final BigDecimal course;

    ExchangeRate(Currency currencyType, BigDecimal course) {
        this.currencyType = currencyType;
        if (course.compareTo(BigDecimal.ZERO) <= 0)
            throw new IllegalArgumentException("The exchange rate cannot be negative or zero.");
        else this.course = course;
    }

    public Currency getCurrencyType() {
        return currencyType;
    }

    public BigDecimal getCourse() {
        return course;
    }
}
