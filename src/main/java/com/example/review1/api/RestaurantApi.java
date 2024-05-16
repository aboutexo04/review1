package com.example.review1.api;

import com.example.review1.api.request.CreateAndEditRestaurantRequest;
import com.example.review1.api.request.CreateAndEditRestaurantRequestMenu;
import com.example.review1.api.response.RestaurantDetailView;
import com.example.review1.api.response.RestaurantView;
import com.example.review1.model.RestaurantEntity;
import com.example.review1.service.RestaurantService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.time.ZonedDateTime;
import java.util.List;

@RequiredArgsConstructor
@RestController
public class RestaurantApi {
    private final RestaurantService restaurantService;
    @GetMapping("/restaurants")
    public List<RestaurantView> getRestaurants(){
        return restaurantService.getAllRestaurants();

    }

    @GetMapping("/restaurant/{restaurantId}")
    public RestaurantDetailView getRestaurant(
            @PathVariable Long restaurantId
    ){
        return restaurantService.getRestaurantDetail(restaurantId);
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
