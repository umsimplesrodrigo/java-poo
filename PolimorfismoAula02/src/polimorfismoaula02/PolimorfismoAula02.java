package polimorfismoaula02;
public class PolimorfismoAula02 {
    public static void main(String[] args) {
        Cachorro c = new Cachorro();
        
        c.reagir("Olá");
        c.reagir(true);
        c.reagir(21, 0);
        c.reagir(11, 45);
    }
    
}
