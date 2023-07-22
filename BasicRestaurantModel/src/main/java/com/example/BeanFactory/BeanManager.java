package com.example.BeanFactory;

import com.example.Model.Restaurant;
import com.example.Model.RestaurantSpecialities;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class BeanManager {
    @Bean
    public List<Restaurant> getListOfRestaurants(){
        Restaurant restaurant1 = new Restaurant("Maharashtrian Food","Near bus stand , Chopda, dist.Jalgaon 425107", 1, "9988776655" ,  RestaurantSpecialities.MAHARASHTRIAN , 10 );
        Restaurant restaurant2 = new Restaurant("Chinese Food","Pankaj stop , Chopda, dist.Jalgaon 425107", 2,"9966332211" ,RestaurantSpecialities.CHINESE , 20 );
        List<Restaurant> listOfRestaurants = new ArrayList<>();
        listOfRestaurants.add(restaurant1);
        listOfRestaurants.add(restaurant2);
        return listOfRestaurants;

    }



}
