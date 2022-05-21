package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe os dados da conta ");
		System.out.print("Número: ");
		int nmber = sc.nextInt();
		System.out.print("Titular: ");
		sc.nextLine();
		String holder = sc.nextLine();
		System.out.print("Saldo: ");
		double balance = sc.nextDouble();
		System.out.print("Limite de saque: ");
		double withdrawLimite = sc.nextDouble();
		
		Account acc = new Account(nmber, holder, balance, withdrawLimite);
		System.out.println();
		System.out.print("Informe uma quantia para sacar: ");
		double amount = sc.nextDouble();
		if (amount > acc.getBalance()) {
			System.out.println("Withdraw error: not enough balance");
		}
		else if(amount > acc.getWithdrawLimit()) {
			System.out.println("Withdraw error: the amount exceeds withdraw limit");
			
		}
		else {
		acc.withdraw(amount);
		}
		System.out.printf("Novo saldo: %.2f", acc.getBalance());
	}

}
