package factory;

import domain.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SymptomFactory3 implements SymptomFactoriable{
	
	private List<Symptom> symptoms = new ArrayList<Symptom>();
	private List<String> digestiveSymptom = new ArrayList<String>();
	private List<String> neuroMuscularSymptom = new ArrayList<String>();
	private List<String> respiratorySymptom = new ArrayList<String>();
	
	public SymptomFactory3() {
		
		List<String> impact5 = Arrays.asList("fiebre", "tos seca", "astenia","expectoracion");
	    List<Double> index5 = Arrays.asList(87.9, 67.7, 38.1, 33.4);
	    List<String> impact3 = Arrays.asList("disnea", "dolor de garganta", "cefalea","mialgia","escalofrios");
	    List<Double> index3 = Arrays.asList(18.6, 13.9, 13.6, 14.8, 11.4);
	    List<String> impact1 = Arrays.asList("nauseas", "vomitos", "congestion nasal","diarrea","hemoptisis","congestion conjuntival", "mareos");
	    List<Double> index1 = Arrays.asList(5.0, 4.8, 3.7, 0.9, 0.8, 1.0);
	    
	    digestiveSymptom = Arrays.asList("nauseas", "vomitos","diarrea");
	    neuroMuscularSymptom = Arrays.asList("fiebre", "astenia", "cefalea", "mialgia","escalofrios", "mareos");
	    respiratorySymptom = Arrays.asList("tos seca","expectoracion","disnea","dolor de garganta", "congestion nasal","hemoptisis","congestion conjuntival");
	    
	    Symptom ns = null;
	    double index = 0;
	    
	    for(int i=0; i<impact5.size(); i++) {
	    	index = index5.get(i);
	    	ns = new Symptom(impact5.get(i), (int)index, 5);
	    	symptoms.add(ns);
	    }
	    
	    for(int i=0; i<impact3.size(); i++) {
	    	index = index3.get(i);
	    	ns = new Symptom(impact3.get(i), (int)index, 3);
	    	symptoms.add(ns);
	    }
	    
	    for(int i=0; i<impact1.size(); i++) {
	    	index = index1.get(i);
	    	ns = new Symptom(impact1.get(i), (int)index, 1);
	    	symptoms.add(ns);
	    }
		
	}
	
	public Symptom createSymptom(String symptomName) {

	    Symptom s = null;
	    for (int i=0; i < symptoms.size(); i++) {
	    	s = symptoms.get(i);
	    	if ( s.getName().equals(symptomName)) {
	    		if (digestiveSymptom.contains(symptomName)) return (DigestiveSymptom) s;
		    	if (neuroMuscularSymptom.contains(symptomName)) return (NeuroMuscularSymptom) s;
		    	if (respiratorySymptom.contains(symptomName)) return (RespiratorySymptom) s;
	    	}
	    }
	    return null;

	}

}
