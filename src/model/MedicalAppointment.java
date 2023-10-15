package model;

public class MedicalAppointment implements Reservable {
    private String doctorName;

    public MedicalAppointment(String doctorName) {
        this.doctorName = doctorName;
    }

    @Override
    public String getDetails() {
        return "Cita médica con: " + doctorName;
    }
}