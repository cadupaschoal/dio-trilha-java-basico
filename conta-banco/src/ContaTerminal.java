import java.lang.System;
import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("\n" + "Digite o número.");
        int numero = scanner.nextInt();

        System.out.println("Digite a agência");
        String agencia = scanner.next();
        
        scanner.nextLine();
        System.out.println("Digite seu nome.");
        String nomeCliente = scanner.nextLine();

        System.out.println("Valor do depósito.");
        double saldo = scanner.nextDouble();

        System.out.println(
                "Olá "+ nomeCliente + ", obrigado por criar uma conta em nosso banco, " +
                "sua agência é "+ agencia +", conta " + numero + " e seu saldo " + saldo +
                " já está disponível para saque."
        );
        scanner.close();
    }
}
