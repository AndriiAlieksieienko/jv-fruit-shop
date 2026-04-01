package core.basesyntax.dao;

import core.basesyntax.model.Accountable;

public interface GoodsDao {
    Accountable create(String goodsName);

    void add(Accountable goods);

    Accountable get(String goodsName);

    boolean isExist(String goodsName);
}
