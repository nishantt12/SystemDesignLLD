package DesignATM.states;

import DesignATM.ATM;
import DesignATM.model.Card;

public class InitialState  extends State{

    @Override
    public void insertCard(Card card, ATM atm) {
        atm.setAtmState(new EnterPinState());
    }

    @Override
    public void exit(ATM atm) {
        atm.setAtmState(new InitialState());
    }
}
