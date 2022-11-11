import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        //Importanto a classe Scanner
        Scanner teclado = new Scanner(System.in);
        System.out.println("Por favor! Digite o numero da Conta Corrente: ");
        int numConta = teclado.nextInt();
        System.out.println("Por favor! Informe o número da Agência: ");
        String agencia = teclado.next();
        System.out.println("Por favor! Informe o seu nome: ");
        String nomeCliente = teclado.next();
        System.out.println("Informe o valor do saldo Atual:");
        double saldo = teclado.nextDouble();

        System.out.println("Olá " + nomeCliente + "!");
        System.out.println("Obrigado por criar uma conta em nosso banco.");
        System.out.println("Sua agência é: " + agencia + " e sua conta é: " + numConta );
        System.out.println("Seu saldo R$" + saldo + ", já está disponível para saque");
    }
}
