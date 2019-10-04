package com.skc.eatgo.interfaces;

import com.skc.eatgo.application.RestaurantService;
import com.skc.eatgo.domain.MenuItem;
import com.skc.eatgo.domain.MenuItemRepository;
import com.skc.eatgo.domain.Restaurant;
import com.skc.eatgo.domain.RestaurantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RestaurantController {

    @Autowired
    private RestaurantService restaurantService;

    @GetMapping("/restaurants")
    public List<Restaurant> list() {
        List<Restaurant> restaurants = restaurantService.getRestaurants();

        return restaurants;
    }

    @GetMapping("/restaurants/{id}")
    public Restaurant detatil(@PathVariable("id") Long id) {
        Restaurant restaurant = restaurantService.getRestaurant(id);

//        Restaurant restaurant = restaurantRepository.findById(id);
//


        return restaurant;
    }
}
