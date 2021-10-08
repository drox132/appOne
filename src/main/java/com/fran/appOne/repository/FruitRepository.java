package com.fran.appOne.repository;

import com.fran.appOne.model.Fruit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FruitRepository extends JpaRepository <Fruit,Integer>  {

    @Query(value = "SELECT * FROM fruit;",nativeQuery = true)
    List<Fruit> selectAllFruit ();

    //en esta cuery como se trata de buscar fruta por id me va  adevolver
    // el objeto Fruit y por eso no debo colocar list sino el objeto Fruit

    @Query(value = "SELECT * FROM fruit WHERE id = :idVariable ",nativeQuery = true)
    Fruit selectFruitById (@Param("idVariable") int id);


    @Query(value = "Exec CreateAndSelectFruit @name = :nameVariable , @price = :priceVariable ",nativeQuery = true)
    Fruit insertFruit (@Param("nameVariable") String name, @Param("priceVariable") int price );
}
