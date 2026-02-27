public class Note{
	public static void main(String[] args){
		// Déclaration des trois notes 
		double note1 = 14.5;
		double note2 = 8.9;
		double note3 = 10.5;
		// Calcul de la moyenne
		double moyenne = (note1 + note2 + note3) / 3;
		// Affichage de la moyenne 
		System.out.println("La moyenne est : " + moyenne);
		// Vérification de l'admission
		if (moyenne >= 10) {
			System.out.println("Admis");
		} else {
			System.out.println("Ajourné");
		}
	}
}
