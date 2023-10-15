import model.Hotel;
import model.Reservation;
import model.RestaurantTable;
import model.User;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {


        User johnDoe = new User("John Doe", "12345678", "+123456789");
        Reservation hotelReservation = new Reservation(johnDoe, LocalDateTime.now(), new Hotel("Hotel Paradiso"));
        Reservation reservaMesa = new Reservation(johnDoe, LocalDateTime.of(2024, 12, 12, 20, 0), new RestaurantTable("Restaurante Estrella"));

        System.out.println(hotelReservation.getReservationDetails());
        System.out.println();
        System.out.println(reservaMesa.getReservationDetails());
    }
}