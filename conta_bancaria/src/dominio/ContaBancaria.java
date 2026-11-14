package dominio;

public class ContaBancaria {
    private int id;
    private static int contador = 1;
    private String titular;
    private int numeroConta;
    private double saldo;

    //passo 02
    public void setTitular(String titular){
        this.id = contador ++;
        if (titular == null || titular.isBlank()) {
            System.out.println("[erro] valor invalido!");
            return;
        }
        this.titular = titular;
    }

    public void setNumeroConta(int numeroConta){
        if (numeroConta <= 0 ){
            System.out.println("[erro] valor invelido!");
            return;
        }
        this.numeroConta = numeroConta;
    }

    //passo 03

    public String getTitular() {return this.titular;}
    public int getNumeroConta() {return  this.numeroConta;}
    public double getSaldo () {return this.saldo;}

    //passo 04
    public void depositar(double valor ){
        if (valor <= 0 || !Double.isFinite(valor)){
            System.out.println("[erro] valor invalido");
            return;
        }
        this.saldo += valor;
    }

    //passo 05
    public void sacar(double valor){
        if (valor <= 0 || !Double.isFinite(valor)) {
            System.out.println("[erro] valor invalido");
            return;
        }
        if (valor > this.saldo) {
            System.out.println("[erro] saldo insuficiente!");
            return;
        }

        this.saldo -= valor;
    }

    //passo 06
    public void exibirDados(){
        System.out.printf("""
                Conta %d
                titular: %s
                numero da conta: %d
                saldo: %f
                
                
                
                """,this.id, this.titular, this.numeroConta, this.saldo);
    }

    //passo 07
    public void transferir(ContaBancaria destino, double valor) {
        if (destino == null) {
            System.out.println("[erro] destino invalido!");
            return;
        }
        if (valor <= 0 || !Double.isFinite(valor)){
            System.out.println("[erro] valor invalido!");
            return;
        }
        if (valor > this.saldo){
            System.out.println("[erro] saldo insuficiente");
            return;
        }
        this.saldo -= valor;
        destino.saldo += valor;
        System.out.println("transferencia realizada com sucesso!");
    }

}
