package core.basesyntax.service.account;

import core.basesyntax.db.Accountable;

public interface AccountHandler {
    void account(Accountable fruit, int amount);
}
