package Model.Class;

import Model.Enum.CustomerType;

import java.util.List;

public class Member extends Customer{
    private double balance;
    private CustomerType type;

    public Member() {
    }

    public Member(Integer IDCustomer, String nama, String email, String company, List<Reservation> listReserve, double balance, CustomerType type) {
        super(IDCustomer, nama, email, company, listReserve);
        this.balance = balance;
        this.type = type;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public CustomerType getType() {
        return type;
    }

    public void setType(CustomerType type) {
        this.type = type;
    }
}
