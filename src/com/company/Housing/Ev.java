package com.company.Housing;

import java.math.BigDecimal;
import java.util.Date;

public class Ev {
    private Long id;
    private BigDecimal amount;
    private BigDecimal squareMetersGross;
    private BigDecimal squareMetersNet;
    private Long yearofConstruction;
    private Long roomCount;
    private Long livingRoomCount;;
    private Long locationFloor;
    private Long floorCountBuilding;

    public Ev() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public BigDecimal getSquareMetersGross() {
        return squareMetersGross;
    }

    public void setSquareMetersGross(BigDecimal squareMetersGross) {
        this.squareMetersGross = squareMetersGross;
    }

    public BigDecimal getSquareMetersNet() {
        return squareMetersNet;
    }

    public void setSquareMetersNet(BigDecimal squareMetersNet) {
        this.squareMetersNet = squareMetersNet;
    }

    public Long getYearofConstruction() {
        return yearofConstruction;
    }

    public void setYearofConstruction(Long yearofConstruction) {
        this.yearofConstruction = yearofConstruction;
    }

    public Long getRoomCount() {
        return roomCount;
    }

    public void setRoomCount(Long roomCount) {
        this.roomCount = roomCount;
    }

    public Long getLivingRoomCount() {
        return livingRoomCount;
    }

    public void setLivingRoomCount(Long livingRoomCount) {
        this.livingRoomCount = livingRoomCount;
    }

    public Long getLocationFloor() {
        return locationFloor;
    }

    public void setLocationFloor(Long locationFloor) {
        this.locationFloor = locationFloor;
    }

    public Long getFloorCountBuilding() {
        return floorCountBuilding;
    }

    public void setFloorCountBuilding(Long floorCountBuilding) {
        this.floorCountBuilding = floorCountBuilding;
    }
}
