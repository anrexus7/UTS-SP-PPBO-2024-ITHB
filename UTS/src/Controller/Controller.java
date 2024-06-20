package Controller;

import Model.Class.Customer;
import Model.Class.Reservation;
import Model.Class.Room;

import java.util.ArrayList;
import java.util.List;

public class Controller {
    private static List<Room> listRoom = new ArrayList<>();

    public static void bookingKamar(){
        for(){

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
