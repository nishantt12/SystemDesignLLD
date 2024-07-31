package DesignATM.services;

import DesignATM.ATM;
import DesignATM.model.Card;

public class FiveHundredAtmWithdrawProcessor extends AtmWithdrawProcessor {
    public FiveHundredAtmWithdrawProcessor(AtmWithdrawProcessor nextAtmWithdrawProcessor) {
        super(nextAtmWithdrawProcessor);
    }

//    @Override
//    void withdrawCash(int amount, ATM atm, Card card) {
//        if (amount!=0){
//            super.withdrawCash(amount, atm, card);
//        }
//    }


    @Override
    public boolean withdrawCash(int amount, ATM atm, Card card) {
        int balance = amount - 500;

            return balance == 0 || super.withdrawCash(amount, atm, card);



    }
}
