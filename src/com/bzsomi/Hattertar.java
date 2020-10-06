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

    public int FoglaltKapacitas(){
        int szum = 0;
        for (int i = 0; i < this.tartalom.size(); i++) {
            szum += this.tartalom.get(i).getTartalom().length();
        }
        return szum;
    }

    public int SzabadKapacitas(){ return this.maxkap - FoglaltKapacitas(); }

    public void Hozzaad(Fajl file){
        if (this.SzabadKapacitas() >= file.getTartalom().length()){
            boolean free = true;
            for (Fajl item : this.tartalom) {
                free = free && !file.getNev().equals(item.getNev());
            }
            if (free){this.tartalom.add(file);}
            System.out.println(free);
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

    public void Listaz(boolean x) {
        for (Fajl item : this.tartalom) {
            System.out.println(item);
        }
    }
}
