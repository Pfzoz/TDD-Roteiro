package org.example;

public class Franc extends Money {
    private int amount;

    Franc(int amount, String currency) {
        super(amount, currency);
    }

    Money times(int multiplier) {
        return new Money.franc(amount * multiplier);
    }

    public boolean equals(Object object) {
        Franc franc = (Franc) object;
        return amount == franc.amount;
    }

    String currency() {
        return "CHF";
    }

}
