package constants;

public enum Currency {
    RUB("₽"),
    EUR("€"),
    USD("$");

    private String symbol;

    Currency(String symbol) {
        this.symbol = symbol;
    }

    public String getSymbol() {
        return symbol;
    }
}
