package com.bzsomi;

public class Main {

    public static void main(String[] args) {
        Floppy test = new Floppy();
        Fajl primavera = new Fajl("Thomas Harris - Hannibal ébredése","txt", "Nem akarom, hogy elítéljék, inkább nyilvánítsák őrültnek. Egy intézményben tanulmányozhatják, és kitalálhatják, hogy micsoda - Szerinted mi?- Hannibal, a kisfiú, meghalt 1945-ben a hóban, amikor megpróbálta megmenteni a húgát. A szíve meghalt Mischával. Hogy most mi? Erre még nincs szó. Jobb híján nevezzük szörnyetegnek");
        test.Hozzaad(primavera);
        test.Listaz();
        DVD zene = new DVD();
        Fajl album = new Fajl("Classic","mp4", "Handel - Vizi ének");
        zene.Hozzaad(album);
        zene.Listaz();
        zene.Zarolas();
        Fajl album2 = new Fajl("Classic","mp3", "Bach - Goldberg variációk");
        zene.Hozzaad(album2);
        zene.Listaz();

    }
}
