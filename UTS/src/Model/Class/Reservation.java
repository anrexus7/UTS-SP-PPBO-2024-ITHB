package Model.Class;

import Model.Enum.ReservationStatus;
import Model.Enum.RoomStatus;

public class Reservation {
    private Integer IDReservation;
    private Integer stayDay;
    private ReservationStatus status;
    private Payment payment;
    private Room room;

    public Reservation() {}

    public Reservation(Integer IDReservation, Integer stayDay, ReservationStatus status, String tipePayment, Payment payment) {
        this.IDReservation = IDReservation;
        this.stayDay = stayDay;
        this.status = status;
        this.payment = payment;
    }

    public void bookRoom(){
        room.setStatus(RoomStatus.BOOKED);
    }

    public void cancelBooking(){
        room.setStatus(RoomStatus.EMPTY);
    }

    public void checkAvailability(){}

    public Integer getIDReservation() {
        return IDReservation;
    }

    public void setIDReservation(Integer IDReservation) {
        this.IDReservation = IDReservation;
    }

    public Integer getStayDay() {
        return stayDay;
    }

    public void setStayDay(Integer stayDay) {
        this.stayDay = stayDay;
    }

    public ReservationStatus getStatus() {
        return status;
    }

    public void setStatus(ReservationStatus status) {
        this.status = status;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }
}
