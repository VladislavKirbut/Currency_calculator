package teachmeskills.vlad.hw14.currencytype;

public class ExchangeRate {
    private Currency currencyType;
    private double course;

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
