package DesignATM.states;

import DesignATM.ATM;
import DesignATM.model.Card;
import DesignATM.services.AtmWithdrawProcessor;
import DesignATM.services.FiveHundredAtmWithdrawProcessor;
import DesignATM.services.HundredAtmWithdrawProcessor;
import DesignATM.services.TwoThousandAtmWithdrawProcessor;

public class WithdrawCashState extends State{


    @Override
    public void withDrawCash(
            int amount,
            ATM atm,
            Card card
    ) {
        AtmWithdrawProcessor atmWithdrawProcessor = new TwoThousandAtmWithdrawProcessor(
                new FiveHundredAtmWithdrawProcessor(new HundredAtmWithdrawProcessor(null))
        );

        boolean isWithdraw = atmWithdrawProcessor.withdrawCash(amount, atm, card);

        if (isWithdraw) {
            atm.setAtmBalance(atm.getAtmBalance() - amount);
            card.getAccount().setBalance(card.getAccount().getBalance() - amount);
            System.out.println("Collect cash");

        } else {
            System.out.println("ATM doesn't have required amount");
            exit(atm);
        }

    }

    @Override
    public void exit(ATM atm) {
        atm.setAtmState(new InitialState());
    }

}
