package com.fran.appOne.service;

import com.fran.appOne.model.Fruit;

import java.util.List;

public interface FruitService {

    List<Fruit> selectAllFruit();

    Fruit selectFruitById (int id);

    String insertFruit ( Fruit fruit);

}
