package DesignATM.states;

import DesignATM.ATM;
import DesignATM.model.Card;

public abstract class State {

    public void insertCard(Card card, ATM atm){
        System.out.println("Something went wrong...");
    }

    public void withDrawCash(int amount,
                      ATM atm,
                      Card card){
        System.out.println("Something went wrong...");
    }

    public void exit(ATM atm){
        System.out.println("Something went wrong...");
    }

    public void enterPin(int pin, Card card, ATM atm){
        System.out.println("Something went wrong...");
    }
}
