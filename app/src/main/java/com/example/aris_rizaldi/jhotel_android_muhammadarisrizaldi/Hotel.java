package com.example.aris_rizaldi.jhotel_android_muhammadarisrizaldi;

public class Hotel {

    private int id;
    private String nama;
    private Lokasi lokasi;
    private int bintang;

    public Hotel(String nama, Lokasi lokasi, int bintang)
    {
        this.nama=nama;
        this.lokasi=lokasi;
        this.bintang=bintang;
        //this.id = DatabaseHotel.getLastHotelID() + 1;
    }

    public int getID() {
        return id;
    }

    public int getBintang()
    {
        return bintang;
    }

    public String getNama()
    {
        return nama;
    }

    public Lokasi getLokasi()
    {
        return lokasi;
    }

    public void setID(int id) {
        this.id = id;
    }

    public void setNama(String nama)
    {
        this.nama=nama;
    }

    public void setLokasi(Lokasi lokasi)
    {
        this.lokasi=lokasi;
    }

    public void setBintang(int bintang)
    {
        this.bintang=bintang;
    }


}