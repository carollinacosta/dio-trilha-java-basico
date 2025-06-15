import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int conta;
        String agencia;
        String nomeCliente;
        double saldo = 5000000;

        System.out.println("Por favor, digite o número da Conta (a conta possui 4 dígitos):");
        conta = scanner.nextInt();
        System.out.println("Por favor, digite o número da Agência: ");
        agencia = scanner.next();
        System.out.println("Por favor, digite o nome do Cliente: ");
        nomeCliente = scanner.next();

        System.out.println("Olá " + nomeCliente + "! Obrigado por criar uma conta em nosso banco.");
        System.out.println("Agência: " + agencia);
        System.out.println("Conta: " + conta);
        System.out.println("Seu saldo: " + saldo + " já está disponível para saque.");


    }
}
