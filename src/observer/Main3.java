package observer;

import domain.Covid19Pacient;

public class Main3 {

	public static void main(String[] args) {
		
		Covid19Pacient p1 = new Covid19Pacient("Aitor", 35);
		PacientObserverGUI pacientGUI1 = new PacientObserverGUI(p1);
		PacientSymptomGUI frame1 = new PacientSymptomGUI(p1);
		PacientThermometerGUI pThermo1 = new PacientThermometerGUI(p1);
		SemaphorGUI semGUI1 = new SemaphorGUI(100, 100, p1);

	}

}
