
import java.util.Locale;
import java.util.Scanner;



public class ContaTerminal {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        // numero da conta
        System.out.println("Por favor, digite o número de sua conta: ");
        int numeroConta = scanner.nextInt();
        // agencia
        System.out.println("Por favor, digite o número da sua agência: ");
        String numeroAgencia = scanner.next();
        // nome do cliente
        System.out.println("Por favor, digite o seu nome completo: ");
        String nomeCliente = scanner.nextLine();
        // saldo da conta
        System.out.println("Por favor, digite o saldo da conta: ");
        double saldo = scanner.nextDouble();


        // IMPRIMINDO OS DADOS
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco. Sua agência é " + numeroAgencia + ", conta " + numeroConta + " e seu saldo de R$" + saldo + " já está disponível para saque.");
        // Fechando o scanner
        scanner.close();


    }
}
