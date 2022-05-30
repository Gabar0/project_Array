
public class ReihungTest {

public static void main(String[] args) {


		Reihung rei = new Reihung(0,0,0);
		rei.einlesen();
		System.out.println(rei.toString());
		System.out.println("Kleinste Zahl in der Reihe: " + rei.getMin());
		System.out.println("Grösste Zahl in der Reihe: " + rei.getMax());
		System.out.println("Summe der korrekten Eingaben: " + rei.berechneSumme());

    }

}
