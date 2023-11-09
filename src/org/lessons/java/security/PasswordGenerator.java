package org.lessons.java.security;

import java.util.Scanner;

public class PasswordGenerator {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Inserisci il tuo nome: ");
		String name = in.nextLine();
		
		System.out.print("Inserisci il tuo cognome: ");
		String surname = in.nextLine();
		
		System.out.print("Inserisci il tuo giorno di nascita: ");
		String dayOfBirth = in.nextLine();
		int day = Integer.valueOf(dayOfBirth);
		
		System.out.print("Inserisci il tuo mese di nascita: ");
		String monthOfBirth = in.nextLine();
		int month = Integer.valueOf(monthOfBirth);
		
		System.out.print("Inserisci il tuo anno di nascita: ");
		String yearOfBirth = in.nextLine();
		int year = Integer.valueOf(yearOfBirth);
		
		int dateSum = day + month + year;
		
		
		System.out.println("la tua password è: " + name + "-" + surname + "-" + dateSum);
}
}
