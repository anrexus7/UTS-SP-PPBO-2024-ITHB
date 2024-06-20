package Model.Class;

import Model.Enum.RoomStatus;
import Model.Enum.TipeKamar;

import java.util.List;

public class Room {
    private Integer roomNumber;
    private Integer capacity;
    private Integer floor;
    private RoomStatus status;
    private TipeKamar tipe;
    private List<Reservation> listReserve;

    public Room(){
    }

    public Room(Integer roomNumber, Integer capacity, Integer floor, RoomStatus status, TipeKamar tipe, List<Reservation> listReserve) {
        this.roomNumber = roomNumber;
        this.capacity = capacity;
        this.floor = floor;
        this.status = status;
        this.tipe = tipe;
        this.listReserve = listReserve;
    }

    public Integer getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(Integer roomNumber) {
        this.roomNumber = roomNumber;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    public Integer getFloor() {
        return floor;
    }

    public void setFloor(Integer floor) {
        this.floor = floor;
    }

    public RoomStatus getStatus() {
        return status;
    }

    public void setStatus(RoomStatus status) {
        this.status = status;
    }
}
