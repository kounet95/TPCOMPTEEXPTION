package pres;

import java.util.InputMismatchException;
import java.util.Scanner;

import metier.Compte;

public class Application {

	public static void main(String[] args) {
	Compte cp =new Compte();
	
	
	
try {
	Scanner sc = new Scanner(System.in);
	System.out.println("Montant a verser:");
	float mt1= sc.nextFloat();
	cp.verser(mt1);
System.out.println("solde actuel:"+ cp.getSolde());
System.out.println("montant a retire");
float mt2= sc.nextFloat();
	cp.retire(mt2);
	
} catch (SoldInsSoufisant e) {
 System.out.println(e.getMessage());
}
catch (InputMismatchException e) {
	System.out.println("les carrecteurs sont pas autorise");
}

	
System.out.println("solde actuel:"+cp.getSolde());
	}

}
