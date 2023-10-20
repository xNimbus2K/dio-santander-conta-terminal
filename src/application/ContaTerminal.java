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

        System.out.println("Ol�! Seja bem-vindo!");
        System.out.println("Por favor, informe os dados abaixo.");
        System.out.print("N�mero da conta: ");
        number = Integer.parseInt(sc.nextLine());
        System.out.print("N�mero da Ag�ncia: ");
        agency = sc.nextLine();
        System.out.print("Nome completo: ");
        clientName = sc.nextLine();
        System.out.print("Saldo: ");
        balance = sc.nextDouble();

        System.out.println();
        System.out.println("Ol� " + clientName + ", obrigado por criar uma conta em nosso banco, " +
                "sua ag�ncia � " + agency + ", conta " + number + " e seu saldo " + balance + " j� est� dispon�vel para saque.");

    }
}
