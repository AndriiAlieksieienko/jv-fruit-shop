package core.basesyntax.dao;

import core.basesyntax.db.Accountable;
import core.basesyntax.db.Fruit;
import core.basesyntax.db.Storage;

public class FruitDaoImpl implements GoodsDao {
    @Override
    public void add(Accountable fruit) {
        Storage.fruits.add(fruit);
    }

    @Override
    public Accountable get(String fruitName) {
        return Storage.fruits.stream()
                .filter(f -> f.getName().equals(fruitName))
                .findFirst().orElse(null);
    }

    @Override
    public Accountable create(String fruitName) {
        Accountable fruit = new Fruit(fruitName);
        add(fruit);
        return fruit;
    }

    @Override
    public boolean isExist(String fruitName) {
        return Storage.fruits.stream()
                .anyMatch(f -> f.getName().equals(fruitName));
    }
}
