package application;

import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int number;
        String agency;
        String clientName;
        double balance;

        System.out.println("Olá! Seja bem-vindo!");
        System.out.println("Por favor, informe os dados abaixo.");
        System.out.print("Número da conta: ");
        number = Integer.parseInt(sc.nextLine());
        System.out.print("Número da Agência: ");
        agency = sc.nextLine();
        System.out.print("Nome completo: ");
        clientName = sc.nextLine();
        System.out.print("Saldo: ");
        balance = sc.nextDouble();

        System.out.println();
        System.out.println("Olá " + clientName + ", obrigado por criar uma conta em nosso banco, " +
                "sua agência é " + agency + ", conta " + number + " e seu saldo " + balance + " já está disponível para saque.");

    }
}
