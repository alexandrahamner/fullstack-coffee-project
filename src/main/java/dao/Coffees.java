package dao;

import models.Coffee;

import java.util.List;

public interface Coffees {
    List<Coffee> all();
    Long insert(Coffee coffee);
}
