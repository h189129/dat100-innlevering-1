package no.hvl.dat100;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class Oppgave03 {
	
	// Metoden ber om et heltall. 
	public static int beOmTall() {
		return parseInt(showInputDialog("Beregn n! (fakultet) av et heltall: "));
	}
	
	
	// Metode for sjekk om tallet er mindre enn 1, eller over 15.
	// Velger å sette denne øvre begrensningen på 15 på grunn av størrelsen på n!. 
	// Kunne benyttet BigInteger i java.math biblioteket, men det har ikke noe hensikt. 
	public static boolean utenforVerdiOmrådet(int n) {
        if (n < 1 || n > 15) {
            String feilmelding = "Tallet må være mellom 1 - 15. Prøv på nytt.";
            showMessageDialog(null, feilmelding);
            return true;
        }
        return false;
    }
	
	
	// Metode for utregning og vise svar i meldingsvindu.
	public static void nFakultet(int n) {
		int fakultet = 1;
		String svarTekst = n + "! (fakultet) er: ";
		
		for (int i = 1; i > 0 && i <= n; i++) {
			 
			 fakultet =  fakultet * i;
		 }
		 showMessageDialog(null, svarTekst + fakultet);
		 
		}

	

	public static void main(String[] args) {
		
		int n;
		 
		do {	
			n = beOmTall();
		} while 
			(utenforVerdiOmrådet(n));
		
		nFakultet(n);	 	
	}
}

