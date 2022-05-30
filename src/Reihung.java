
import java.util.Arrays;
import java.util.Scanner;

/** class Reihung
 * Klasse zum Einlesen von einer Reihung und die maximale Anzahl ganzer Zahlen zwischen untere Grenze und obere Grenze.
 *
 */

public class Reihung {

	int korrektenEingaben;
	int FehlEingaben;
	int summe = 0;
	int min = 0;
	int max = 0;
	int temp = 0;
	int maxAnzahl = 10;
	int untereGrenze = -5;
	int obereGrenze = 5;

	int[]reihung = new int[maxAnzahl];
	int[]reihung2 ;


	/** Konstruktor Reihung 1, 2
	 * Anhand der Übergabeparameter in der Konstruktor  werden die Eigenschaften der Reihung, die später über Tastatureingaben gefüllt wird, festgelegt.
	 *
	 * @param untereGrenze
	 * 		Der minimale Wert der Reihung.
	 *
	 * @param obereGrenze
	 * 		Der maximale Wert der Reihung
	 *
	 * @param maxAnzahl
	 * 		Die Länge der Reihung.
	 */

	public Reihung(int untereGrenze, int obereGrenze, int maximaleAnzahl){

	}

	public Reihung(int[] reihung){

	}

	/**
	 * Methode zum , Einlesen der Zahlen für die Reihung über die Tastatur,
	 * Erscheinen die untereGrenze und obereGrenze,
	 * Erscheinen die Anzahl der korrekten und der falschen Eingaben,
	 * Speichern die korrekten Zahlen in einer Reihung.
	 */

	public void einlesen() {
		int eingabe;
		int i = 0;
		Scanner sc = new Scanner(System.in);
		do{
			System.out.println("Geben sie eine Zahl zwischen -5 und 5 inklusive ein (0 zum beenden):");
			eingabe = sc.nextInt();
					if (eingabe <= obereGrenze && eingabe >= untereGrenze) {
						reihung[i] = eingabe;
						i++;
						korrektenEingaben++;
						System.out.println("Zahl korrekt");

					} else {
						System.out.println("Zahl nicht korrekt");
						FehlEingaben++;

					}

		}

		while(eingabe !=0 && i < maxAnzahl);

		reihung2 = new int[korrektenEingaben];
		System.arraycopy(reihung, 0, reihung2, 0, korrektenEingaben);

	}



	/**
	 * *Methode zum Geben den kleinsten Wert der Reihung zurück.
	 */
		   public int getMin() {
			int minIndex = 0;
			for(int i = 1; i < reihung.length; i++){
				if(reihung[i] < reihung[minIndex]){
					minIndex = i;
				}
			}
				min = reihung[minIndex];
		        return min;
		   }

	 /**
	  * Methode zum Geben den größten  Wert der Reihung zurück.
	  */
		  public int getMax() {
		    int maxIndex = reihung.length-1;
			for(int i = 0; i < reihung.length; i++){
				if(reihung[i] > reihung[maxIndex]){
						maxIndex = i;
				}
			}
				 max = reihung[maxIndex];
				 return max;
		  }

     /**
	  * Methode zum Berechnen die Summe der Werte der Reihung und gibt diese zurück.
	  */
				public int berechneSumme() {
					for(int i = 0; i < reihung.length; i++){
						summe += reihung[i];
				    }
					return summe;
                }

	 /**
	  * Methode zum Erstellten eine sortierte Kopie der Reihung und gibt sie zurück.
	  */

				public int[] sortiereReihung(){
					int temp;

					for (int i=0; i<reihung.length-1; i++)
			        {
			            for (int j=i+1; j<reihung.length; j++)
			            {
			                if ( reihung[i] > reihung[j] )
			                {
			                         temp = reihung[i];
			                    reihung[i] = reihung[j];
			                    reihung[j] = temp;
			                }
			            }
			        }
					return reihung;

				}

	/**
	 * Methode zum Geben eine Zeichenkettendarstellung für die untere Grenze,
	 * die obere Grenze ,die Zahlen der Reihung und sortierte Kopie der originale Reihung als String zurück.
	 */
				public String toString(){

				return "\nAnzahl der korrekten Eingaben: " + korrektenEingaben + "\nAnzahl der Fehleingaben: " + FehlEingaben+ "\nObere erlaubte Grenze: " + obereGrenze + "\nUntere erlaubte Grenze:" +
						untereGrenze  + "\nZahlen der Reihung: " + Arrays.toString(reihung) + "\nSortierte Reihung: " + Arrays.toString(sortiereReihung());

				}



}
