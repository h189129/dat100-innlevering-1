// Innlevering 1 - a, b og c. 

package no.hvl.dat100;
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class Oppgave01 {
	
	
	// Metode som sjekker om poengene som er skrevet inn faller utenfor gyldig skala.
	// Om utenfor skala vises feilmelding til bruker. 
	// Returnerer true om poengverdi er utenfor skala og false om den er innenfor skala.
    public static boolean utenforSkala(int poeng) {
        if (poeng < 0 || poeng > 100) {
            String feilmelding = "Ugyldig tall. Poeng må være mellom 0 og 100. Vennligst forsøk på nytt.";
            showMessageDialog(null, feilmelding);
            return true;
        }
        return false;
    }
    
    // En egen metode for å be om, og holde på, antall poeng. 
    public static int antallPoeng() {
        return parseInt(showInputDialog("Poeng: "));
    }
    
    // Metoden inneholder logikken som forteller hvilken karakter en gitt poengverdi gir dersom den er innenfor gyldig skala. 
    public static void fraPoengTilKarakter(int poeng) {
    	String dialog = "Din karakter er: ";

        if (poeng >= 0 && poeng < 40)
            showMessageDialog(null, dialog + "F");

        else if (poeng >= 40 && poeng < 50)
            showMessageDialog(null, dialog + "E");

        else if (poeng >= 50 && poeng < 60)
            showMessageDialog(null, dialog + "D");

        else if (poeng >= 60 && poeng < 80)
            showMessageDialog(null, dialog + "C");

        else if (poeng >= 80 && poeng < 90)
            showMessageDialog(null, dialog + "B");

        else if (poeng >= 90 && poeng <= 100)
            showMessageDialog(null, dialog + "A");
    }
    
    
    // Setter sammen metodene for å løse oppgaven. 
    // Ved å dele opp koden i metoder er det også lettere å se i main hva programmet utfører. 
    public static void main(String[] args) {
    	
        // x = antall personer
        int x = parseInt(showInputDialog("Hvor mange personer skal sjekke karakteren sin (Maks 10): "));
        
        for (int i = 1; i <= x && i <= 10; i++) {
        	int poeng;
        	
        	
        	// Viser dialogvindu og ber om antall poeng på nytt så lenge poengverdi faller utenfor skala. 
        	// Altså så lenge utenforSkala(poeng) = true.
        	// Når utenforSkala(poeng) = false kjøres fraPoengTilKarakter(poeng) metoden.
        	// Deretter går loopen på nytt til antall personer, opp til 10 stk, har fått sjekket karakteren sin.
        	do {
        		poeng = antallPoeng();
        	}
        	while (utenforSkala(poeng));
        	
            fraPoengTilKarakter(poeng);
            
        }        
    }
}
