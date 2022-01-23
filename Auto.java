package com.company;

import java.util.Objects;

public class Auto {
    private String marka;
    private String kolor;
    private int predkosc;
    private int rokProdukcji;

    public Auto(String kolor, int predkosc, int rokProdukcji) {
        this.kolor = kolor;
        this.predkosc = predkosc;
        this.rokProdukcji = rokProdukcji;
    }

    public Auto(String marka, String kolor, int predkosc, int rokProdukcji) {
        this.marka = marka;
        this.kolor = kolor;
        this.predkosc = predkosc;
        this.rokProdukcji = rokProdukcji;
    }

    @Override
    public String toString() {
        return "Auto - " +
                "marka:" + marka +
                ", kolor samochodu:" + kolor +
                ", prędkość:" + predkosc + "," + '\n' +
                "       rok produkcji:" + rokProdukcji;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Auto auto = (Auto) o;
        return predkosc == auto.predkosc && rokProdukcji == auto.rokProdukcji && Objects.equals(marka, auto.marka) && Objects.equals(kolor, auto.kolor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(marka, kolor, predkosc, rokProdukcji);
    }
}