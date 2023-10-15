package model;

public class Hotel implements Reservable {
    private String hotelName;

    public Hotel(String hotelName) {
        this.hotelName = hotelName;
    }

    @Override
    public String getDetails() {
        return "Hotel: " + hotelName;
    }
}