package teachmeskills.vlad.hw14.currencytype;

public enum Currency {
    BYN ("����������� �����"),
    USD ("������ ���"),
    EUR ("����"),
    GBP ("���� ����������"),
    RUB ("���������� �����"),
    CNY ("��������� ����");

    private final String russianNameOfCurrency;
    Currency (String russianNameOfCurrency) {
        this.russianNameOfCurrency = russianNameOfCurrency;
    }

    public String getNumericValue() {
        return russianNameOfCurrency;
    }
}
