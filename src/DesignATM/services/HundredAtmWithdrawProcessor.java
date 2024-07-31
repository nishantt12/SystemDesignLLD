package DesignATM.services;

import DesignATM.ATM;
import DesignATM.model.Card;

public class HundredAtmWithdrawProcessor extends AtmWithdrawProcessor {
    public HundredAtmWithdrawProcessor(AtmWithdrawProcessor nextAtmWithdrawProcessor) {
        super(nextAtmWithdrawProcessor);
    }

    @Override
    public boolean withdrawCash(int amount, ATM atm, Card card) {
        int balance = amount -100;
        return balance == 0 || super.withdrawCash(amount, atm, card);
    }
}
