package teachmeskills.vlad.hw14.currencytype;

import java.math.BigDecimal;

public class ExchangeRate {
    private Currency currencyType;
    private BigDecimal course;

    ExchangeRate(Currency currencyType, BigDecimal course) {
        this.currencyType = currencyType;
        this.course = course;
    }

    public Currency getCurrencyType() {
        return currencyType;
    }

    public BigDecimal getCourse() {
        return course;
    }
}
