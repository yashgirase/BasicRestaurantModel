package com.example.Service;

import com.example.Model.Restaurant;
import com.example.Model.RestaurantSpecialities;
import com.example.Repository.RestaurantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RestaurantService {
    @Autowired
    RestaurantRepository restaurantRepository;

    public Restaurant getRestaurantById(Integer id) {
        List<Restaurant> restaurants = restaurantRepository.getListOfRestaurants();

        for(Restaurant restaurant : restaurants){
            if(restaurant.getRestaurantId().equals(id)){
                return restaurant;
            }
        }
       return null;
    }

    public List<Restaurant> getAllRestaurants() {
        return restaurantRepository.getListOfRestaurants();
    }

    public String addRestaurant(Restaurant restaurant) {
        List<Restaurant> restaurants = restaurantRepository.getListOfRestaurants();
        restaurants.add(restaurant);
        return "Restaurant Added Successfully..";
    }


    public String updateRestaurantSpeciality(RestaurantSpecialities restaurantSpeciality , Integer id) {
        List<Restaurant> restaurants = restaurantRepository.getListOfRestaurants();

        for(Restaurant restaurant : restaurants){
            if(restaurant.getRestaurantId().equals(id)){
                restaurant.setRestaurantSpeciality(restaurantSpeciality);
                break;
            }
        }
        return "Restaurant Speciality Updated..";

    }

    public String deleteRestaurantById(Integer id) {
        List<Restaurant> restaurants = restaurantRepository.getListOfRestaurants();
        for(Restaurant restaurant : restaurants){
            if(restaurant.getRestaurantId().equals(id)){
                restaurants.remove(restaurant);
                break;
            }
        }
        return "restaurant successfully deleted..";
    }
}
