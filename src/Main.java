public class Main {
    public static void main(String[] args) {

        ContaCorrente cc = new ContaCorrente("007", 1000);
        ContaPoupança cp = new ContaPoupança("222",5000);


        // CONTA CORRENTE

        System.out.println("O saldo da conta corrente de número "+cc.getNumero()+ " é R$ "+cc.getSaldo());
        System.out.println();

        System.out.println("Após depósito de R$100");
        cc.deposito(100);
        System.out.println("Novo saldo é R$"+cc.getSaldo()+"\n");

        System.out.println("Após depósito de R$400");
        cc.deposito(400);
        System.out.println("Novo saldo é R$"+cc.getSaldo()+"\n");

        System.out.println("Após saque de R$200");
        cc.saque(200);
        System.out.println("Novo saldo é R$"+cc.getSaldo());


        // CONTA POUPANÇA
        System.out.println("\n========================= CONTA POUPANÇA =========================\n");
        System.out.println("O saldo da conta poupança de número "+cp.getNumero()+ " é de R$"+cp.getSaldo()+"\n");

        System.out.println("Após depósito de R$1000");
        cp.deposito(1000);
        System.out.println("Novo saldo é R$"+cp.getSaldo()+"\n");

        System.out.println("Após 1 mês com juros de 0,5%");
        cp.juros(0.5);
        System.out.println("seu novo saldo é R$"+cp.getSaldo());



















    }
}