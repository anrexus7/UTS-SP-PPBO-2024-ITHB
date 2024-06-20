package Controller;

import Model.Class.Customer;
import Model.Class.Reservation;
import Model.Class.Room;
import Model.Enum.ReservationStatus;
import Model.Enum.RoomStatus;

import java.util.ArrayList;
import java.util.List;

public class Controller {
    private static List<Room> listRoom = new ArrayList<>();

    public static void bookingKamar(Integer numberRoom, String tipePayment){
        for(Room tempRoom : listRoom){
            if(tempRoom.getRoomNumber()== numberRoom && tempRoom.getStatus().equals(RoomStatus.EMPTY)){
                tempRoom.getReserve().bookRoom();
                tempRoom.getReserve().getPayment().proccessPayment();
            }
        }
    }

    public static void cancelKamar(Integer numberRoom){
        for(Room tempRoom : listRoom){
            tempRoom.getReserve().cancelBooking();
        }
    }

    public static double calculateTotalRevenue(){
        double totalRevenue = 0;
        List<Customer> customer = new ArrayList<>();
        for(Customer tempCustomer : customer){
            for(Reservation tempReserve : tempCustomer.getListReserve()){
                totalRevenue += tempReserve.getPayment().getAmount();
            }
        }
        return totalRevenue;
    }
}
