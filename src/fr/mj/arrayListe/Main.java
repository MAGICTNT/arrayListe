package fr.mj.arrayListe;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	static Scanner monScanner = new Scanner(System.in);
	private static String motQuestion = "Y";
	private static String ajoutMot = "";

	public static void main(String[] args) {

		ArrayList<String> listeMot = new ArrayList<>();
		ArrayList<Integer> listeChiffre = new ArrayList<>();

		ajouterArray(listeMot);

		for (int i = 0; i <= listeMot.size() - 1; i++)
			System.out.println(listeMot.get(i));

	}

	private static void ajouterArray(ArrayList<String> listeMot) {
		while (!motQuestion.equalsIgnoreCase("N")) {
			System.out.println("ecrire un mot");
			ajoutMot = monScanner.nextLine();
			listeMot.add(ajoutMot);
			System.out.println("Voulez-vous ajouter un autre mot?");
			motQuestion = monScanner.nextLine();
		}
	}

}
