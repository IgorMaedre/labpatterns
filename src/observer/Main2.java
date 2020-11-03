package observer;

import domain.Covid19Pacient;

public class Main2 {

	public static void main(String[] args) {
		
		Covid19Pacient p1 = new Covid19Pacient("Aitor", 35);
		PacientObserverGUI pacientGUI1 = new PacientObserverGUI(p1);
		PacientSymptomGUI frame1 = new PacientSymptomGUI(p1);
		PacientThermometerGUI pThermo1 = new PacientThermometerGUI(p1);
		
		Covid19Pacient p2 = new Covid19Pacient("Iker", 70);
		PacientObserverGUI pacientGUI2 = new PacientObserverGUI(p2);
		PacientSymptomGUI frame2 = new PacientSymptomGUI(p2);
		PacientThermometerGUI pThermo2 = new PacientThermometerGUI(p2);
		
		Covid19Pacient p3 = new Covid19Pacient("Mikel", 10);
		PacientObserverGUI pacientGUI3 = new PacientObserverGUI(p3);
		PacientSymptomGUI frame3 = new PacientSymptomGUI(p3);
		PacientThermometerGUI pThermo3 = new PacientThermometerGUI(p3);

	}

}
