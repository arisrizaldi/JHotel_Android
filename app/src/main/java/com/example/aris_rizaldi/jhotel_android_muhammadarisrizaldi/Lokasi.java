package com.example.aris_rizaldi.jhotel_android_muhammadarisrizaldi;

public class Lokasi {
    private float x_coord;
    private float y_coord;
    private String deskripsi;

    public Lokasi(float x_coord, float y_coord, String deskripsiLokasi) {
        this.x_coord=x_coord;
        this.y_coord=y_coord;
        this.deskripsi=deskripsiLokasi;
    }

    public float getX() {
        return x_coord;
    }

    public float getY() {
        return y_coord;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setX(float x_coord) {
        this.x_coord=x_coord;
    }

    public void setY(float y_coord) {
        this.y_coord=y_coord;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi=deskripsi;
    }

}

