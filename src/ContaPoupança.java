public class ContaPoupança extends ContaCorrente{
    double juros;
    ContaPoupança(String numero, int saldo) {
        super(numero, saldo);
    }

    void juros(double juros) {
        saldo = juros*saldo + saldo;
    }
    double getJuros(){
        return this.juros;
    }


}

