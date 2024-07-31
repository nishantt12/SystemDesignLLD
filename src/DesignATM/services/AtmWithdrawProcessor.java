package DesignATM.services;

import DesignATM.ATM;
import DesignATM.model.Card;

abstract public class AtmWithdrawProcessor {
    AtmWithdrawProcessor nextAtmWithdrawProcessor;

    public AtmWithdrawProcessor(AtmWithdrawProcessor nextAtmWithdrawProcessor) {
        this.nextAtmWithdrawProcessor = nextAtmWithdrawProcessor;
    }

   public boolean withdrawCash(
            int amount,
            ATM atm,
            Card card){
        if (nextAtmWithdrawProcessor!=null){
            return nextAtmWithdrawProcessor.withdrawCash(amount, atm, card);
        } else {
            return false;
        }
    }


}
