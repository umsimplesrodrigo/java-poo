package polimorfismoaula01.animais;

import polimorfismoaula01.Mamifero;

public class Cachorro extends Mamifero{
    public void enterrarOsso() {
        System.out.println("Enterrando Osso!");
    }
    
    public void abanarRabo() {
        System.out.println("Abanando Rabo!");
    }
    
    @Override
    public void emitirSom() {
        System.out.println("Latindo!");
    }
}
