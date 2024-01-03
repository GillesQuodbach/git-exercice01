package gitExercice01;

import java.util.*;

public class GitExo01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		boolean reload = true;

		System.out.println("Bienvenue au PMU !");
		while (reload) {
			boolean horseValidNumber = true;
			while (horseValidNumber) {
				// Nombre de chevaux au départ
				System.out.println("Nombre de chevaux (12 - 20)");
				int userResponseHowManyHorses = scan.nextInt();
				System.out.println(userResponseHowManyHorses);

				if (userResponseHowManyHorses < 12 || userResponseHowManyHorses > 20) {
					System.out.println("Vous devez choisir un chiffre entre 12 et 20");
				} else {
					horseValidNumber = false;
					// Liste des chevaux
					ArrayList<Integer> horsesList = new ArrayList<>();
					// Remplissage de la liste des chevaux
					for (int i = 0; i < userResponseHowManyHorses; i++) {
//						int horseNumber = 1 + (int) (Math.random() * ((userResponseHowManyHorses - 1) + 1));
//						horsesList.add(horseNumber);
						horsesList.add(i + 1);
					}
					System.out.println(horsesList);
					Collections.shuffle(horsesList);
					System.out.println(horsesList);
					// Type de jeu
					System.out.println("Voulez-vous jouer au tiercé (1), au quarté (2) ou au quinté(5)");
					horseValidNumber = false;
					int userResponseWichGame = scan.nextInt();
					System.out.println(userResponseWichGame);

					if (userResponseWichGame == 1) {
						// imprimmé les 3 premiers chevaux
						System.out.println("L'arrivé du tièrcé est: " + horsesList.get(0) + " " + horsesList.get(1)
								+ " " + horsesList.get(2));
					} else if (userResponseWichGame == 2) {
						// imprimmé les 4 premiers chevaux
						System.out.println("L'arrivé du tièrcé est: " + horsesList.get(0) + " " + horsesList.get(1)
								+ " " + horsesList.get(2) + " " + horsesList.get(3));
					} else if (userResponseWichGame == 3) {
						// imprimmé les 5 premiers chevaux
						System.out.println("L'arrivé du tièrcé est: " + horsesList.get(0) + " " + horsesList.get(1)
								+ " " + horsesList.get(2) + " " + horsesList.get(3) + " " + horsesList.get(4));

					}

				}
			}
			scan.nextLine();

			System.out.println("Rejouer ? Y/N");
			String playerResponse = scan.nextLine();
			if (playerResponse.equals("y")) {
				reload = true;
				System.out.println("C'est parti !!!!");
			} else {
				reload = false;
				System.out.println("A bientot");
			}

		}

		scan.close();

	}

}
