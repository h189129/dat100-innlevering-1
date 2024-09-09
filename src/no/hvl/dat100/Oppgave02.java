package no.hvl.dat100;
import static java.lang.Double.*;
import static javax.swing.JOptionPane.*;
import static java.lang.Math.*;

public class Oppgave02 {

	
	public static double beOmInntekt() {
		return parseDouble(showInputDialog("Legg inn inntekt: "));
	}
	
	public static void akkumulertTrinnSkatt(double inntekt) {
		
		//Trinnskatt prosenter
		double trinn1Pros = 0.017;
		double trinn2Pros = 0.04;
		double trinn3Pros = 0.136;
		double trinn4Pros = 0.166;
		double trinn5Pros = 0.176;
		
		// Akkumulert trinnskatt	
		double trinnSkatt1 = (292850 - 208051) * trinn1Pros;
		double trinnSkatt2 = ((670000 - 292851) * trinn2Pros) + trinnSkatt1;
		double trinnSkatt3 = ((937900 - 670001) * trinn3Pros) + trinnSkatt2;
		double trinnSkatt4 = ((1350000 - 937901) * trinn4Pros) + trinnSkatt3;
		//double trinnSkatt5 = ((inntekt - 1350001) * trinn5Pros) + trinnSkatt4;
		
		String dialog = "Beregnet trinnskatt: ";
		
		if (inntekt >= 0 && inntekt <= 208050)
            showMessageDialog(null, dialog + "0 kr");

        else if (inntekt >= 208051 && inntekt <= 292850) {
        	double trinnSkatt = (inntekt - 208051) * trinn1Pros;
            showMessageDialog(null, dialog + round(trinnSkatt) + " kr");
        }
		
        else if (inntekt >= 292851 && inntekt <= 670000) {
        	double trinnSkatt = ((inntekt - 292851) * trinn2Pros) + trinnSkatt1;
        	showMessageDialog(null, dialog + round(trinnSkatt) + " kr");
        }
		
        else if (inntekt >= 670001 && inntekt <= 937900) {
        	double trinnSkatt = ((inntekt - 670001) * trinn3Pros) + trinnSkatt2;
        	showMessageDialog(null, dialog + round(trinnSkatt) + " kr");
        }
		
        else if (inntekt >= 937901 && inntekt <= 1350000) {
        	double trinnSkatt = ((inntekt - 937901) * trinn4Pros) + trinnSkatt3;
        	showMessageDialog(null, dialog + round(trinnSkatt) + " kr");
        }
		
        else if (inntekt >= 1350001) {
        	double trinnSkatt = ((inntekt - 1350001) * trinn5Pros) + trinnSkatt4;
        	showMessageDialog(null, dialog + round(trinnSkatt) + " kr");
        }
		
	}
	
	public static void main(String[] args) {
		
		akkumulertTrinnSkatt(beOmInntekt());
		
	}

}
