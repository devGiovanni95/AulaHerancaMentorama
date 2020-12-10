public class TestaConta {
    public static void main(String[] args) {
      /*  Conta c1 = new Conta(1,1,"Banco Inter ", 10.00);
        System.out.println(c1);
*/

        ContaCorrente cc1 = new ContaCorrente(22,1,"Banco Inter", 100.00,1000.00);
        System.out.println(cc1);

        System.out.println("O saldo da conta corrente é R$ " + cc1.getSaldo());
    }

}
