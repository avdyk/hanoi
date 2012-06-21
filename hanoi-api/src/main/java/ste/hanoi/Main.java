package ste.hanoi;

import java.util.Scanner;
import java.util.ServiceLoader;

/**
 * Point d'entrée de l'application. L'implémentation doit être renseignée dans
 * un fichier META-INF/services/ste.hanoi.IHanoi.
 * 
 * @author <a href="mailto:avandyck@gmail.com">Arnaud Vandyck</a>
 * @version 1.0
 * 
 */
public class Main {

	public static void main(String... args) {
		IHanoi jeu = ServiceLoader.load(IHanoi.class).iterator().next();
		jeu.init();
		String entree = null;
		System.out.println("L'[o]rdi ou le [j]oueur?");
		entree = new Scanner(System.in).nextLine();
		if ("j".equals(entree)) {
			System.out.println(jeu.toString());
			entree = input();
			while (!"s".equals(entree)) {
				if ("r".equals(entree)) {
					jeu.init();
				} else {
					Scanner s = new Scanner(entree).useDelimiter(",");
					int from = s.nextInt();
					int to = s.nextInt();
					jeu.move(from, to);
				}
				System.out.println(jeu.toString());
				entree = input();
			}
		} else {
			jeu.move(4, 0, 1, 2);
		}
	}

	private static String input() {
		System.out.println("Entrez la tour de départ et la tour "
				+ "d'arrivée (exemple: 0,2). "
				+ "'s' pour sortir et 'r' pour rejouer");
		return (new Scanner(System.in)).nextLine();
	}
}
