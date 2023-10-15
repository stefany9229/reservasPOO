package model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Reservation {
    private User user;
    private LocalDateTime reservationDateTime;
    private Reservable item;

    public Reservation(User user, LocalDateTime reservationDateTime, Reservable item) {
        this.user = user;
        this.reservationDateTime = reservationDateTime;
        this.item = item;
    }

    public String getReservationDetails() {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        String formattedDateTime = reservationDateTime.format(formatter);

        return "Nombre: " + user.getNombre() + "\n" +
                "Documento: " + user.getDocumento() + "\n" +
                "Número de Contacto: " + user.getNumeroDeContacto() + "\n" +
                "Fecha y Hora: " + formattedDateTime + "\n" +
                "Reservando: " + item.getDetails();
    }
}
