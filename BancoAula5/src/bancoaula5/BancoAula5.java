package bancoaula5;

/**
 *
 * @author umsimplesfdp
 */
public class BancoAula5 {

    public static void main(String[] args) {
        Banco b1 = new Banco();
        
        b1.setDono("Rodrigo");
        b1.setNum_conta(1);
        b1.abrirConta("cc");
        b1.pagarMensalidade();
        b1.sacar(30f);
        b1.fecharConta();
        b1.estadoAtual();
    }
    
}
