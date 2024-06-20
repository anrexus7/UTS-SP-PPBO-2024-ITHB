package Model.Class;

import java.util.List;

public class Customer{
    private Integer IDCustomer;
    private String nama;
    private String email;
    private String company;
    private List<Reservation> listReserve;

    public Customer() {
    }

    public Customer(Integer IDCustomer, String nama, String email, String company, List<Reservation> listReserve) {
        this.IDCustomer = IDCustomer;
        this.nama = nama;
        this.email = email;
        this.company = company;
        this.listReserve = listReserve;
    }

    public Integer getIDCustomer() {
        return IDCustomer;
    }

    public void setIDCustomer(Integer IDCustomer) {
        this.IDCustomer = IDCustomer;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public List<Reservation> getListReserve() {
        return listReserve;
    }

    public void setListReserve(List<Reservation> listReserve) {
        this.listReserve = listReserve;
    }
}
