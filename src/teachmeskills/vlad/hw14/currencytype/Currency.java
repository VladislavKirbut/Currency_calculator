package teachmeskills.vlad.hw14.currencytype;
import java.lang.Enum;

public enum Currency {

    BYN ("Белорусский рубль"),
    USD ("Доллар США"),
    EUR ("Евро"),
    GBP ("Фунт стерлингов"),
    RUB ("Российский рубль"),
    CNY ("Китайский юань");

    private final String russianNameOfCurrency;
    Currency (String russianNameOfCurrency) {
        this.russianNameOfCurrency = russianNameOfCurrency;
    }

    public String getNumericValue() {
        return russianNameOfCurrency;
    }
}
