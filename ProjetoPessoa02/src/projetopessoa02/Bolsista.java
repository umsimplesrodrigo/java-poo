package projetopessoa02;
public class Bolsista extends Aluno{
    private int bolsa;

    public void renovarBolsa() {
        System.out.println("Renovando bolsa do aluno " + this.nome);
    }
    
    // @Override
    public void pagarMensalidade() {
        
    }
    
    public int getBolsa() {
        return bolsa;
    }

    public void setBolsa(int bolsa) {
        this.bolsa = bolsa;
    }
    
    
}
