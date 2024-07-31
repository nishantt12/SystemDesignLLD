package DesignATM.states;

import DesignATM.ATM;
import DesignATM.model.Card;

public class EnterPinState extends State{

    @Override
    public void enterPin(int pin, Card card, ATM atm) {
            if (pin != card.getPin()){
                throw new IllegalStateException("Please enter correct pin");
            }
            atm.setAtmState(new WithdrawCashState());
    }

    @Override
    public void exit(ATM atm) {
        atm.setAtmState(new InitialState());
    }
}
