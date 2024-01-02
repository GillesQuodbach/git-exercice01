package gitExercice01;
import java.util.*;

public class GitExo01 {

	public static void main(String[] args) {

		boolean reload = true;
		
		// Nombre de chevaux au départ
		int horseOnGrid = 14;
		
		// Liste des chevaux
		ArrayList<Integer> horsesList = new ArrayList<>();
		
		
		// Remplissage de la liste des chevaux
		for (int i = 0; i < horseOnGrid ;i++) {
		 int horseNumber = 1 + (int) (Math.random() * ((horseOnGrid - 1)+1));
		 horsesList.add(horseNumber);
		}
		System.out.println(horsesList);
	}

}
