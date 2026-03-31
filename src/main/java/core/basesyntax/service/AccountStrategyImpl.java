package core.basesyntax.service;

import core.basesyntax.service.account.AccountHandler;
import core.basesyntax.service.account.AccountType;
import java.util.Map;

public class AccountStrategyImpl implements AccountStrategy {
    private Map<AccountType, AccountHandler> accountHandlerMap;

    public AccountStrategyImpl(Map<AccountType, AccountHandler> accountHandlerMap) {
        this.accountHandlerMap = accountHandlerMap;
    }

    @Override
    public AccountHandler get(AccountType type) {
        return accountHandlerMap.get(type);
    }
}
