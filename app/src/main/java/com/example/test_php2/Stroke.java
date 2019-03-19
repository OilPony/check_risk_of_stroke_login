package com.example.test_php2;

public class Stroke {

    private int id;
    private double sm1;

    public Stroke() {
    }

    public Stroke(int id, double sm1, double sm2) {
        this.id = id;
        this.sm1 = sm1;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSm1() {
        return sm1;
    }

    public void setSm1(double sm1) {
        this.sm1 = sm1;
    }


    @Override
    public String toString() {
        return id + "ค่าความปากมุมปากซ้าย-ขวา" + sm1;
    }

}