package com.fran.appOne.service.implementation;

import com.fran.appOne.model.Fruit;
import com.fran.appOne.repository.FruitRepository;
import com.fran.appOne.service.FruitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FruitServiceImplementation implements FruitService {

    private final FruitRepository fruitRepository;

    @Autowired
    public FruitServiceImplementation(FruitRepository fruitRepository) {
        this.fruitRepository = fruitRepository;
    }

    @Override
    public List<Fruit> selectAllFruit() {
        return fruitRepository.selectAllFruit();
    }

    @Override
    public Fruit selectFruitById(int id) {
        return fruitRepository.selectFruitById(id);
    }

    @Override
    public void insertFruit(Fruit fruit) {
        fruitRepository.insertFruit(fruit.getName(), fruit.getPrice());

    }
}
