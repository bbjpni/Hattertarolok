package com.bzsomi;

public class Floppy extends Hattertar{

    private boolean lock;
    public Floppy() {
        super(1440*1024);
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

    public void pocok(){this.lock = !this.lock;}
}
