import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Definindo variáveiS
        int numero;
        String agencia;
        String nomeCliente;
        double saldo;
        // Solicitando os dados ao usuário
        System.out.print("Por favor, digite o número da conta: ");
        numero = scanner.nextInt();
        scanner.nextLine(); // Consumir o newline

        System.out.print("Por favor, digite o número da agência: ");
        agencia = scanner.nextLine();

        System.out.print("Por favor, digite o nome do cliente: ");
        nomeCliente = scanner.nextLine();

        System.out.print("Por favor, digite o saldo inicial: ");
        saldo = scanner.nextDouble();

        System.out.print("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo de R$ " + saldo + " já está disponível para saque");

        scanner.close();
    }
}
