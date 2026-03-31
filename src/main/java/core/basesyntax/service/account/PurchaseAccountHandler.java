package core.basesyntax.service.account;

import core.basesyntax.db.Accountable;

public class PurchaseAccountHandler implements AccountHandler {
    @Override
    public void account(Accountable fruit, int amount) {
        fruit.setAmount(fruit.getAmount() - amount);
    }
}
