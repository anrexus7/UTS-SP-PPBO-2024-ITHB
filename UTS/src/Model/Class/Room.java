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
    private Reservation Reserve;

    public Room(){
    }

    public Room(Integer roomNumber, Integer capacity, Integer floor, RoomStatus status, TipeKamar tipe, Reservation Reserve) {
        this.roomNumber = roomNumber;
        this.capacity = capacity;
        this.floor = floor;
        this.status = status;
        this.tipe = tipe;
        this.Reserve = Reserve;
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

    public Reservation getReserve() {
        return Reserve;
    }

    public void setReserve(Reservation reserve) {
        Reserve = reserve;
    }

    public TipeKamar getTipe() {
        return tipe;
    }

    public void setTipe(TipeKamar tipe) {
        this.tipe = tipe;
    }
}
