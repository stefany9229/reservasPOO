package model;

public class RestaurantTable implements Reservable {
    private String restaurantName;

    public RestaurantTable(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    @Override
    public String getDetails() {
        return "Mesa en el restaurante: " + restaurantName;
    }
}