package polimorfismoaula01.animais;

import polimorfismoaula01.Mamifero;

public class Canguru extends Mamifero{
    public void usarBolsa() {
        System.out.println("Usando Bolsa!");
    }
    
    @Override
    public void locomover() {
        System.out.println("Pulando");
    }
}
