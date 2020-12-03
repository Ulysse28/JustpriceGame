package fr.ulysse.Graven;
import java.util.Random;
import java.util.Scanner;

public class just_price {

	public static void main(String[] args) {
		
		//INTRO
		System.out.println("Bienvenue dans ce jeu en langage java !");
		System.out.println("Tu vas devoir choisir un nombre entre 0 et 100.");
		
		//Initialisation des variables
		//Le nombre à trouver
		Random r = new Random();
		int justprice = r.nextInt(100);
		
		//le prix saisi par le joueur
		int price = 0;
		
		//Score du joueur
		int score = 1;
		
		//Boucle du jeu
		while(price != justprice) {
			System.out.println(justprice);
			//Saisie du nombre par le joueur
			System.out.println("Entre un nombre au pif: ");
			Scanner scan = new Scanner(System.in);
			price = scan.nextInt();
			
			//Comparaisons
			if(price < justprice) {
				System.out.println("C'est plus !");
				score ++;
			}else if (price > justprice) {
				System.out.println("C'est moins !");
				score ++;
			}
		}System.out.println("Bravo ! Tu as trouvé en " + score  + " fois!");

		}
	}
