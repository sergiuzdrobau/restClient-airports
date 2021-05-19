package org.example.entity;


public class Flight {

    private int id;
    private String number;
    private int airlineId;
    private int departureId;
    private int arrivalId;

    @Override
    public String toString() {
        return "Flight{" +
                "id=" + id +
                ", number='" + number + '\'' +
                ", airlineId=" + airlineId +
                ", departureId=" + departureId +
                ", arrivalId=" + arrivalId +
                '}';
    }

    public Flight() {
    }

    public Flight(String number, int airlineId, int departureId, int arrivalId) {
        this.number = number;
        this.airlineId = airlineId;
        this.departureId = departureId;
        this.arrivalId = arrivalId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public int getAirlineId() {
        return airlineId;
    }

    public void setAirlineId(int airlineId) {
        this.airlineId = airlineId;
    }

    public int getDepartureId() {
        return departureId;
    }

    public void setDepartureId(int departureId) {
        this.departureId = departureId;
    }

    public int getArrivalId() {
        return arrivalId;
    }

    public void setArrivalId(int arrivalId) {
        this.arrivalId = arrivalId;
    }
}
