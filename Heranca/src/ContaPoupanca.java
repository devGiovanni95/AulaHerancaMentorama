public class ContaPoupanca extends Conta{
    private int diaAniversario;
    private double taxaDeJuros;

    public ContaPoupanca(int numero, int agencia, String banco, double saldo, double sacar, double depositar, int diaAniversario, double taxaDeJuros) {
        super(numero, agencia, banco, saldo, sacar, depositar);
        this.diaAniversario = diaAniversario;
        this.taxaDeJuros = taxaDeJuros;
    }

//    public ContaPoupanca(int numero, int agencia, String banco, double saldo, int diaAniversario, double taxaDeJuros) {
//        super(numero, agencia, banco, saldo);
//        this.diaAniversario = diaAniversario;
//        this.taxaDeJuros = taxaDeJuros;
//    }

    @Override
    public double getSaldo() {
        return this.saldo + this.taxaDeJuros*this.saldo;
    }

    @Override
    public double getSacar() {
        return 0;
    }

    @Override
    public double getDepositar() {
        return 0;
    }

    @Override
    public double getSaldoAtualizado() {
        return  (this.getSaldo() + this.depositar - this.getSacar());
    }
}
