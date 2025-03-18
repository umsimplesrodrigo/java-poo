package polimorfismoaula01;
public class PolimorfismoAula01 {
    public static void main(String[] args) {
        Mamifero m = new Mamifero();
        Reptil r = new Reptil();
        Peixe p = new Peixe();
        Ave a = new Ave();
        
        a.setPeso(87.3f);
        a.setIdade(2);
        a.setMembros(4);
        a.locomover();
        a.alimentar();
        a.emitirSom();
        a.fazerNinho();
    }
    
}
