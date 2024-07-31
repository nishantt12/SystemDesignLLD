package DesignATM;

import DesignATM.model.Card;
import DesignATM.states.InitialState;
import DesignATM.states.State;

public class ATM {

    private State atmState;
    private Card card;

    private int atmBalance;


    public State getAtmState() {
        return atmState;
    }

    public void setCard(Card card) {
        this.card = card;
    }

    public int getAtmBalance() {
        return atmBalance;
    }

    public void setAtmBalance(int atmBalance) {
        this.atmBalance = atmBalance;
    }

    public ATM(){
        atmState = new InitialState();
    }

    public void setAtmState(State atmState) {
        this.atmState = atmState;
    }

    public void enterCard(Card card){
        this.card = card;
        atmState.insertCard(card, this);
    }

    public void enterPin(int pin){
        atmState.enterPin(pin, card, this);
    }

    public void withDrawCash(int amount){
        atmState.withDrawCash(amount, this, card);
    }

}
