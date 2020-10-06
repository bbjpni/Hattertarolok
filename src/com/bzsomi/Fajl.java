package com.bzsomi;

public class Fajl {
    private String nev;
    private String kiterjesztes;
    private int meret;
    private String tartalom;

    public Fajl(String nev, String kiterjesztes, String tartalom) {
        this.nev = nev;
        this.kiterjesztes = kiterjesztes;
        this.meret = tartalom.length();
        this.tartalom = tartalom;
    }

    public String getTartalom() {
        return tartalom;
    }

    public void setTartalom(String tartalom) {
        this.tartalom = tartalom;
    }

    @Override
    public String toString() {
        return String.format("%s.%s %.2fbite", nev, kiterjesztes, (meret/8.0));
    }
}
