package DesignATM.services;

import DesignATM.ATM;
import DesignATM.model.Card;

public class TwoThousandAtmWithdrawProcessor extends AtmWithdrawProcessor {
    public TwoThousandAtmWithdrawProcessor(AtmWithdrawProcessor nextAtmWithdrawProcessor) {
        super(nextAtmWithdrawProcessor);
    }

    @Override
    public boolean withdrawCash(int amount, ATM atm, Card card) {
        int balance = amount - 2000;
        return balance == 0 || super.withdrawCash(amount, atm, card);

    }
}
