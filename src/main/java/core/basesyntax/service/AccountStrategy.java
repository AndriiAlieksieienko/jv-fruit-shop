package core.basesyntax.service;

import core.basesyntax.service.account.AccountHandler;
import core.basesyntax.service.account.AccountType;

public interface AccountStrategy {
    AccountHandler get(AccountType type);
}
