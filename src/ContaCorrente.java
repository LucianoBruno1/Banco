public class ContaCorrente {

    private String numero;
   private double saldo;
    private int saque;
    private int deposito;


    public  ContaCorrente(String numero, double saldo){
        this.numero = numero;
        this.saldo = saldo;
        this.saque = saque;
    }



    //GET SET NUMERO
    String getNumero(){
        return this.numero;
    }
    void setNumero(String numero){
        this.numero = numero;
    }



    //GET SET SALDO
    double getSaldo(){
        return this.saldo;
    }
    void setSaldo(double saldo){
        this.saldo=saldo;
    }



    //GET SET DEPOSITO
    int getDeposito(){
        return this.deposito;
    }
    void setDeposito(int deposito){
        this.deposito += deposito;
    }

    void deposito(int deposito){
        saldo += deposito;
}

    void saque(int saque){
        saldo -= saque;
    }

    }