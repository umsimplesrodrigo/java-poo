package bancoaula5;
/**
 *
 * @author umsimplesfdp
 */
public class Banco {
    public int num_conta;
    protected String tipo_conta;
    private String dono;
    private float saldo;
    private boolean status;

    public Banco() {
        this.saldo = 0;
        this.status = false;
    }
    
    public void estadoAtual() {
        System.out.println("------------------");
        System.out.println("N da conta: " + this.getNum_conta());
        System.out.println("Dono: " +  this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.isStatus());
    }

    public int getNum_conta() {
        return num_conta;
    }

    public void setNum_conta(int num_conta) {
        this.num_conta = num_conta;
    }

    public String getTipo_conta() {
        return tipo_conta;
    }

    public void setTipo_conta(String tipo_conta) {
        this.tipo_conta = tipo_conta;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return this.saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    public void abrirConta(String tipo_c) {
        this.setStatus(true);
        this.setTipo_conta(tipo_c);
        switch (tipo_conta) {
            case "cc" -> {
                this.setSaldo(50f);
                System.out.println("Saldo inicial: R$ 50,00");
            }
            case "cp" -> {
                this.setSaldo(150f);
                System.out.println("Saldo incial: R$ 150,00");
            }
            default -> System.out.println("Tipo inexistente");
        }
        System.out.println("Parabéns " +  this.getDono() + ". Conta aberta com sucesso!");
    }
    
    public void fecharConta() {
        if (this.status == false) {
            System.out.println("Conta já desativada!");
        } else if (this.getSaldo() > 0) {
            System.out.println("Realize o saque da sua conta antes: R$ " + this.saldo);
        } else {
            System.out.println("Conta desativada!");
            this.status = false;
        }
    }
    
    public void depositar(float v) {
        if (this.isStatus()) {
            this.setSaldo(this.getSaldo() + v);
            System.out.println("Depositou R$ " + v);
        }
    }
    
    public void sacar(float valor) {
        if (this.isStatus()) {
            if (valor > this.saldo) {
            System.out.println("Valor acima do saldo");
            System.out.println("Saldo de R$ " + this.saldo);
            } else {
            this.saldo -= valor;
            System.out.println("Sacou R$ "  + valor);
            }
        } else {
            System.out.println("Sua conta está desativada!");
        }
    }
    
    public void pagarMensalidade() {
        if (this.tipo_conta.equals("cc") && this.saldo > 20) {
            System.out.println("Mensalidade paga");
            this.saldo -= 20;
        } else if (this.tipo_conta.equals("cp") && this.saldo > 50) {
            System.out.println("Mensalidade paga");
            this.saldo -= 50;
        } else {
            System.out.println("Não possui saldo suficiente para pagar mensalidade!");
            System.out.println("Por favor, realize um depósito!");
        }
    }
}
