package com.example.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Data
@NoArgsConstructor
@AllArgsConstructor
public class Restaurant {

    private String restaurantName;
    private String restaurantAddress;
    private Integer restaurantId;
    private String restaurantNo;
    private RestaurantSpecialities restaurantSpeciality;
    private Integer totalStaffs;


}
