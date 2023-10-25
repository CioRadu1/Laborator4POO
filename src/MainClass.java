import java.awt.Color;

public class MainClass {

	public static void main(String[] args) {
		
		
		Rezervor rezervorUnu = new Rezervor(100, 20);  
		Sofer soferUnu = new Sofer ("Mihnea", 46, 9812);
		Autovehicul masinaUnu = new Autovehicul ("Mercedes", 300, Color.WHITE, 30.35f, 5, soferUnu, rezervorUnu); 
		masinaUnu.accelerare(30);
		System.out.println(masinaUnu);
		rezervorUnu.umplere(20);
		masinaUnu.accelerare(30);
		System.out.println(masinaUnu);
		rezervorUnu.umplere(10);
		masinaUnu.accelerare(300);
		System.out.println(masinaUnu);
		rezervorUnu.umplere(500);
		masinaUnu.decelerare(30);
		System.out.println(masinaUnu);
		masinaUnu.oprire();
		System.out.println(masinaUnu);
	}

}
