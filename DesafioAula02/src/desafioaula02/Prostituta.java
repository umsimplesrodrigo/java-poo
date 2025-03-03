package desafioaula02;

/**
 *
 * @author umsimplesfdp
 */
public class Prostituta {
    String nome;
    int idade;
    float valor;
    boolean atendendo;
    
    void iniciarPrograma() {
        if (atendendo == true) {
            System.out.println("No momento ela está em atendimento.");
        } else {
            System.out.println("Ploc ploc ploc ploc...");
        }
    }
    
    void finalizarPrograma() {
        atendendo = false;
    }
    
    void atender() {
        atendendo = true;
    }
}
