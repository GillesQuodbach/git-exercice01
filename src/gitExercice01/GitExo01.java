package gitExercice01;

import java.util.*;

public class GitExo01 {

	public static void main(String[] args) {
		boolean reload = true;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Bienvenue au PMU !");

		System.out.println("Combien de chevaux son au depart de la course ? (12 - 20)");

		// Nombre de chevaux au départ
		int userResponseHowManyHorses = scanner.nextInt();
		System.out.println(userResponseHowManyHorses);

		// Type de jeu
		System.out.println("Voulez-vous jouer au tiercé (1), au quarté (2) ou au quinté(5)");

		int userResponseWichGame = scanner.nextInt();
		System.out.println(userResponseWichGame);

		// Liste des chevaux
		ArrayList<Integer> horsesList = new ArrayList<>();

		// Remplissage de la liste des chevaux
		for (int i = 0; i < userResponseHowManyHorses; i++) {
			int horseNumber = 1 + (int) (Math.random() * ((userResponseHowManyHorses - 1) + 1));
			horsesList.add(horseNumber);
		}
		
		if (userResponseWichGame == 1) {
			// imprimmé les 3 premiers chevaux
			System.out.println("L'arrivé du tièrcé est: " + horsesList.get(0) + " " + horsesList.get(1) + " " + horsesList.get(2) );
		} else if (userResponseWichGame == 2) {
			// imprimmé les 4 premiers chevaux
		} else if (userResponseWichGame == 3) {
			// imprimmé les 5 premiers chevaux
		}
		
		System.out.println(horsesList);
	}

}
