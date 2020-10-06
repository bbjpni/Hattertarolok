package com.bzsomi;

import java.util.ArrayList;

public class Szamitogep {
    private ArrayList<Hattertar> hardware;

    public Szamitogep(){
        hardware = new ArrayList<>();
    }

    public void Felcsatol(Hattertar part){
        this.hardware.add(part);
    }

    public int SzabadKapacitas(){
        int szum = 0;
        for (Hattertar part: this.hardware) {
            szum+= part.SzabadKapacitas();
        }
        return szum;
    }

    public int FoglaltKapacitas(){
        int szum = 0;
        for (Hattertar part: this.hardware) {
            szum+= part.FoglaltKapacitas();
        }
        return szum;
    }
    public int Osszkapacitas(){
        int szum = 0;
        for (Hattertar part: this.hardware) {
            szum+= part.MaximalisKapacitas();
        }
        return szum;
    }
}
