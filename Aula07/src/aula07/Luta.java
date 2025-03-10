package aula07;

import java.util.Random;

/**
 *
 * @author umsimplesfdp
 */
public class Luta {
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovado;

    public Luta() {
    }
    
    public void marcarLuta(Lutador l1, Lutador l2) {
        this.setDesafiado(l1);
        this.setDesafiante(l2);
        if (l1.getCategoria().equals(l2.getCategoria()) && l1 != l2) {
            this.setAprovado(true);
        } else {
            this.setAprovado(false);
            this.setDesafiado(null);
            this.setDesafiante(null);
        }
    }
    
    public void lutar() {
        if (this.getAprovado()) {
            System.out.println("### Desafiado");
            this.getDesafiado().apresentar();
            System.out.println("### Desafiante");
            this.getDesafiante().apresentar();
            
            Random ale = new Random();
            int vencedor = ale.nextInt(3);
            
            switch (vencedor) {
                case 0 -> {
                    //Empate
                    System.out.println("Empatou");
                    this.getDesafiado().empatarLuta();
                    this.getDesafiante().empatarLuta();
                }
                case 1 -> {
                    //Vitória desafiado
                    System.out.println("Vitória para " + this.getDesafiado().getNome());
                    System.out.println("Derrota para " + this.getDesafiante().getNome());
                    this.getDesafiado().ganharLuta();
                    this.getDesafiante().perderLuta();
                }
                case 2 -> {
                    //Vitória desafiante
                    System.out.println("Vitória para " + this.getDesafiante().getNome());
                    System.out.println("Derrota para " + this.getDesafiado().getNome());
                    this.getDesafiante().ganharLuta();
                    this.getDesafiado().perderLuta();
                }
            }
        } else {
            System.out.println("A luta não pode acontecer!");
        }
    }

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean getAprovado() {
        return aprovado;
    }

    public void setAprovado(boolean aprovado) {
        this.aprovado = aprovado;
    }
}
