package sample;


import Bierki.*;

public class Gracz {
    Król krol;
    Królowa krolowa;
    Goniec goniec_1;
    Goniec goniec_2;
    Skoczek skoczek_1;
    Skoczek skoczek_2;
    Wieża wieza_1;
    Wieża wieza_2;
    Pionek[] pionek = new Pionek[8];

    public Gracz() {
        krol = new Król();
        krolowa = new Królowa();
        goniec_1 = new Goniec();
        goniec_2 = new Goniec();
        skoczek_1 = new Skoczek();
        skoczek_2 = new Skoczek();
        wieza_1 = new Wieża();
        wieza_2 = new Wieża();
        for(int i = 0; i<8; i++) {
            pionek[i] = new Pionek();
        }
    }


}
