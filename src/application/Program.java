package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;
import exceptions.BusinesExceptions;

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
		
		
		try{
		acc.withdraw(amount);
		System.out.printf("Novo saldo: %.2f", acc.getBalance());
		}
		catch (BusinesExceptions e) {
			System.out.println(e.getMessage());
		}
		sc.close();
	}

}
