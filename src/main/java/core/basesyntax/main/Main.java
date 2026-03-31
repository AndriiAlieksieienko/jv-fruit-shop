package core.basesyntax.main;

import core.basesyntax.dao.FruitDaoImpl;
import core.basesyntax.filemanager.FileManager;
import core.basesyntax.filemanager.FileManagerImpl;
import core.basesyntax.service.AccountStrategy;
import core.basesyntax.service.AccountStrategyImpl;
import core.basesyntax.service.ShopService;
import core.basesyntax.service.ShopServiceImpl;
import core.basesyntax.service.account.AccountHandler;
import core.basesyntax.service.account.AccountType;
import core.basesyntax.service.account.BalanceAccountHandler;
import core.basesyntax.service.account.PurchaseAccountHandler;
import core.basesyntax.service.account.ReturnAccountHandler;
import core.basesyntax.service.account.SupplyAccountHandler;
import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<AccountType, AccountHandler> accountHandlerMap = new HashMap<>();
        accountHandlerMap.put(AccountType.BALANCE, new BalanceAccountHandler());
        accountHandlerMap.put(AccountType.SUPPLY, new SupplyAccountHandler());
        accountHandlerMap.put(AccountType.PURCHASE, new PurchaseAccountHandler());
        accountHandlerMap.put(AccountType.RETURN, new ReturnAccountHandler());

        AccountStrategy accountStrategy = new AccountStrategyImpl(accountHandlerMap);
        ShopService shopService = new ShopServiceImpl(new FruitDaoImpl(), accountStrategy);

        FileManager fileManager = new FileManagerImpl();
        List<String[]> inputData = fileManager.read("resources" + File.separator + "input.csv");
        List<String[]> outputData = shopService.process(inputData);
        fileManager.write(outputData, "resources" + File.separator + "output.csv");
    }
}
