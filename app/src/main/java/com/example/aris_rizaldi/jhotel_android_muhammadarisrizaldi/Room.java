package com.example.aris_rizaldi.jhotel_android_muhammadarisrizaldi;

public class Room {

    private String roomNumber;
    private String statusKamar;
    private double dailyTariff;
    private String tipeKamar;

    /**
     * Constructor for objects of class Room
     */
    public Room(String nomor_kamar,String statusKamar, double dailyTariff, String tipeKamar)
    {
        this.roomNumber = nomor_kamar;
        this.statusKamar = statusKamar;
        this.dailyTariff = dailyTariff;
        this.tipeKamar = tipeKamar;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public double getDailyTariff() {
        return dailyTariff;
    }

    public String getStatusKamar(){
        return statusKamar;
    }

    public String getTipeKamar(){
        return tipeKamar;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public void setDailyTariff(double dailytariff) {
        dailyTariff = dailytariff;
    }

    public void setStatusKamar(String status_kamar) {
        this.statusKamar = status_kamar;
    }

    public void setTipeKamar(String tipeKamar) {
        this.tipeKamar = tipeKamar;
    }
}

