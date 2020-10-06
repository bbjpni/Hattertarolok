package com.bzsomi;

public class DVD extends Hattertar{
    private boolean lock;
    public DVD() {
        super(4700*1024*1024);
        this.lock = false;
    }
    public void Hozzaad(Fajl file){
        if (!this.lock){super.Hozzaad(file);}
    }

    public void Torol(Fajl file){
        if (!this.lock){super.Torol(file);}
    }

    public void Format(){
        if (!this.lock){super.Format();}
    }
    public void Zarolas(){
        this.lock = true;
    }

    public int SzabadKapacitas(){return !this.lock ? super.SzabadKapacitas() : 0;}
}
