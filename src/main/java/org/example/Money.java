package org.example;

abstract class Money {
    protected int amount;
    private String currency;

    Money(int amount, String currency) {
        this.currency = currency;
        this.amount = amount;
    }

    @Override
    public boolean equals(Object object) {
        Money money = (Money) object;
        return amount == money.amount && getClass().equals(money.getClass());
    }

    static Money dollar(int amount) {
        return new Dollar(amount, "USD");
    }

    static Money franc(int amount) {
        return new Franc(amount, "CHF");
    }

    abstract Money times(int multiplier);



}
