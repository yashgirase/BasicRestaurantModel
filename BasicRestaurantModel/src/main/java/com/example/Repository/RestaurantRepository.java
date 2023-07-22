package com.example.Repository;

import com.example.Model.Restaurant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class RestaurantRepository {
    @Autowired
    List<Restaurant> listOfRestaurants;

    public List<Restaurant> getListOfRestaurants(){
        return listOfRestaurants;
    }


}
