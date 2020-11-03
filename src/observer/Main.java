package observer;

import java.util.Observable;

import domain.Covid19Pacient;

public class Main {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		Covid19Pacient p1 = new Covid19Pacient("Aitor", 35);
		Covid19Pacient p2 = new Covid19Pacient("Iker", 70);
		
		PacientObserverGUI pacientGUI1 = new PacientObserverGUI(p1);
		PacientSymptomGUI frame1 = new PacientSymptomGUI(p1);
		
		PacientObserverGUI pacientGUI2 = new PacientObserverGUI(p2);
		PacientSymptomGUI frame2 = new PacientSymptomGUI(p2);

	}


}
