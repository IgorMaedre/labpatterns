package factory;

import domain.Symptom;

public interface SymptomFactoriable {
	
	public Symptom createSymptom(String symptomName);

}
