import DesignATM.ATM;
import DesignATM.model.Account;
import DesignATM.model.Card;

public class Main {
    public static void main(String[] args) {
        ATM atm = new ATM();
        Card card = new Card(1234, new Account(2000));
        atm.setAtmBalance(4000);
        atm.getAtmState().insertCard(card, atm);

        atm.getAtmState().enterPin(1234, card, atm);
        atm.getAtmState().withDrawCash(3500, atm, card);
    }
}