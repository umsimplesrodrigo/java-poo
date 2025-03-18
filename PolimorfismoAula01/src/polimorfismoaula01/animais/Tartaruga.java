package polimorfismoaula01.animais;

import polimorfismoaula01.Reptil;

public class Tartaruga extends Reptil{
    @Override
    public void locomover() {
        System.out.println("Andando beeem devagar");
    }
}
