package com.example.review1.api;

import com.example.review1.api.request.CreateAndEditRestaurantRequest;
import com.example.review1.api.request.CreateAndEditRestaurantRequestMenu;
import com.example.review1.model.RestaurantEntity;
import com.example.review1.service.RestaurantService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
public class RestaurantApi {
    private final RestaurantService restaurantService;
    @GetMapping("/restaurants")
    public String getRestaurants(){
        return "This is getRestaurants";
    }

    @GetMapping("/restaurant/{restaurantId}")
    public String getRestaurant(
            @PathVariable Long restaurantId
    ){
        return "This is getRestaurant"+restaurantId;
    }

    @PostMapping("/restaurant")
    public void createRestaurant(
            @RequestBody CreateAndEditRestaurantRequest request
            ){
            restaurantService.createRestaurant(request);
    }
    @PutMapping("/restaurant/{restaurantId}")
    public void editRestaurant(
            @PathVariable Long restaurantId,
            @RequestBody CreateAndEditRestaurantRequest request
            )
    {
        restaurantService.editRestaurant(restaurantId, request);
    }

    @DeleteMapping("restaurant/{restaurantId}")
    public void deleteRestaurant(@PathVariable Long restaurantId)
    {
        restaurantService.deleteRestaurant(restaurantId);
    }
}
