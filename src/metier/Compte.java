package metier;

import java.util.InputMismatchException;

import pres.MontanNegatifException;
import pres.SoldInsSoufisant;

public class Compte {
 private int code;
 private float solde;
 public void verser(float mt)throws SoldInsSoufisant {
	 if (mt<0) throw new MontanNegatifException ("nnn");{
		 solde=solde +mt; 
	 }
	 
	
 }
 public void retire(float mt)throws SoldInsSoufisant, MontanNegatifException {
	 if (mt>solde) throw new MontanNegatifException("solde est insufisant");
	 solde =solde-mt;
 }
public float getSolde()  {
	return solde;
}
 
}
