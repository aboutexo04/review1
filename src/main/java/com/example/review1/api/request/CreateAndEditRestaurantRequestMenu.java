package com.example.review1.api.request;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class CreateAndEditRestaurantRequestMenu {
    private final String name;
    private final int price;

}
