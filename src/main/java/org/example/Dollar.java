package org.example;

public class Dollar extends Money {
    private int amount = 10;
    public Dollar(int amount, String currency) {
        super(amount, currency);
    }
    Money times(int multiplier) {
        return new Money.dollar(amount * multiplier);
    }

    public boolean equals(Object object) {
        Dollar dollar = (Dollar) object;
        return amount == dollar.amount;
    }

    String currency() {
        return "USD";
    }

}
