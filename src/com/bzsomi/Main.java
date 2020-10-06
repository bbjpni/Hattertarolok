package com.bzsomi;

public class Main {

    public static void main(String[] args) {
        Hattertar Winchester = new Hattertar(800000);
        Fajl szoveg = new Fajl("xxx","txt","01234567765432100");
        Winchester.Hozzaad(szoveg);
        double x = Winchester.FoglaltKapacitas();
        System.out.println(x);
    }
}
