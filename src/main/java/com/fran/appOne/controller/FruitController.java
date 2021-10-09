package com.fran.appOne.controller;

import com.fran.appOne.model.Fruit;
import com.fran.appOne.service.FruitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping ("/fruit")
public class FruitController {

    private final FruitService fruitService;

    @Autowired
    public FruitController(FruitService fruitService) {
        this.fruitService = fruitService;
    }
    @GetMapping ("/select/all")
    public List<Fruit> selectAllFruit () {
        return fruitService.selectAllFruit();
    }

    //en este caso que necesitamos que el usuario meata el dato de id
    //debemos colocar en la URL el nombre de la variable del argumento
    //encerrado en llaves  y dentro del argumento se debe colocar
    //@PathVariable a la izquierda del argumento

    @GetMapping ("select/by/{id}")
    public Fruit selectAllById (@PathVariable  int id) {
        return fruitService.selectFruitById(id);
    }

    @PostMapping ("/insert/new")
    public String insertFruit (@RequestBody Fruit fruit) {
        String respuestaDelServiceultimaFruta = fruitService.insertFruit( fruit);
        return respuestaDelServiceultimaFruta;

    }

}
