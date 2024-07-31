package DesignATM.model;

public class Card {

    private int pin;
    private Account account;

    public Card(int pin, Account account) {
        this.pin = pin;
        this.account = account;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }
}
