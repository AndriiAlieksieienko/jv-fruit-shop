package core.basesyntax.service.account;

import core.basesyntax.db.Accountable;

public class BalanceAccountHandler implements AccountHandler {
    @Override
    public void account(Accountable fruit, int amount) {
        fruit.setAmount(amount);
    }
}
