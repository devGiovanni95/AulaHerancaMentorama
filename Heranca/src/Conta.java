
public abstract class Conta {
    private int numero;
    private int agencia;
    private String banco;
    protected double saldo;/* private so e disponivel dentro da propria conta*/

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

   public abstract double getSaldo();
    /* como o get saldo sera uma classe abstrata por ter uma funcao
     e mostrar um valor especifico
    em cada tipo de conta ele se torna uma classe abtrata
    sendo assim ele nao podera retornar nada

    {
        return saldo;
    }*/

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Conta(int numero, int agencia, String banco, double saldo) {
        this.numero = numero;
        this.agencia = agencia;
        this.banco = banco;
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Conta{" +
                "numero = " + numero +
                ", agencia = " + agencia +
                ", banco = '" + banco + '\'' +
                ", saldo = " + saldo +
                '}';
    }
}
