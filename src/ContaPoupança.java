public class ContaPoupança extends ContaCorrente{


    private double juros;


    public ContaPoupança(String numero, double saldo) {
        super(numero, saldo);

    }

     void juros(double juros) {
         setSaldo(getSaldo() * juros + getSaldo());
    }






}





