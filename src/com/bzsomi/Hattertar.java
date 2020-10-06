package com.bzsomi;

import java.util.ArrayList;

public class Hattertar {
    private int maxkap;
    private ArrayList<Fajl> tartalom;

    public Hattertar(int kapacitas){
        this.maxkap = kapacitas;
        this.tartalom = new ArrayList<>();
    }

    public void Format(){
        this.tartalom.clear();
    }

    public int MaximalisKapacitas(){
        return this.maxkap;
    }

    public double FoglaltKapacitas(){
        double szum = 0;
        for (int i = 0; i < this.tartalom.size(); i++) {
            szum += this.tartalom.get(i).getTartalom().length()/8.0;
        }
        return szum;
    }

    public double SzabadKapacitas(){ return this.maxkap - FoglaltKapacitas(); }

    public void Hozzaad(Fajl file){
        if (this.SzabadKapacitas() >= file.getTartalom().length()/8.0){
            boolean free = true;
            for (Fajl item : this.tartalom) {
                free = free && !file.getNev().equals(item.getNev());
            }
            if (free){this.tartalom.add(file);}
        }
    }

    public void Torol(Fajl file){
        for (Fajl item: this.tartalom) {
            if (item.getNev().equals(file.getNev())){ this.tartalom.remove(file); }
        }
    }

    public void Listaz(){
        for (Fajl item:this.tartalom) {
            System.out.println(item);
        }
    }

}
