package com.example.review1.api.request;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@Getter
@AllArgsConstructor
public class CreateAndEditRestaurantRequest {
    private final String name;
    private final String address;
    private final List<CreateAndEditRestaurantRequestMenu > menus;
}
