package domain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SymptomFactory2 {
	
	private List<Symptom> symptoms = new ArrayList<Symptom>();

	public Symptom createSymptom(String symptomName) {
		List<String> impact5 = Arrays.asList("fiebre", "tos seca", "astenia","expectoracion");
	    List<Double> index5 = Arrays.asList(87.9, 67.7, 38.1, 33.4);
	    List<String> impact3 = Arrays.asList("disnea", "dolor de garganta", "cefalea","mialgia","escalofrios");
	    List<Double> index3 = Arrays.asList(18.6, 13.9, 13.6, 14.8, 11.4);
	    List<String> impact1 = Arrays.asList("nauseas", "vomitos", "congestion nasal","diarrea","hemoptisis","congestion conjuntival", "mareos");
	    List<Double> index1 = Arrays.asList(5.0, 4.8, 3.7, 0.9, 0.8, 1.0);
	    
	    List<String> digestiveSymptom=Arrays.asList("nauseas", "vomitos","diarrea");
	    List<String> neuroMuscularSymptom=Arrays.asList("fiebre", "astenia", "cefalea", "mialgia","escalofrios", "mareos");
	    List<String> respiratorySymptom=Arrays.asList("tos seca","expectoracion","disnea","dolor de garganta", "congestion nasal","hemoptisis","congestion conjuntival");

	    Symptom s = null;
	    for (int i=0; i < symptoms.size(); i++) {
	    	s = symptoms.get(i);
	    	if ( s.getName().equals(symptomName)) {
	    		if (digestiveSymptom.contains(symptomName)) return (DigestiveSymptom) s;
		    	if (neuroMuscularSymptom.contains(symptomName)) return (NeuroMuscularSymptom) s;
		    	if (respiratorySymptom.contains(symptomName)) return (RespiratorySymptom) s;
	    	}
	    }

	    if (s == null) {
	    	int impact=0;
		    double index=0;
		    if (impact5.contains(symptomName)) {impact=5; index= index5.get(impact5.indexOf(symptomName));}
		      else if (impact3.contains(symptomName)) {impact=3;index= index3.get(impact3.indexOf(symptomName));}
		        else if (impact1.contains(symptomName)) {impact=1; index= index1.get(impact1.indexOf(symptomName));}
		 
		    if (impact!=0)  {
		    	s = new Symptom(symptomName,(int)index, impact);
		    	symptoms.add(s);
		    	if (digestiveSymptom.contains(symptomName)) return (DigestiveSymptom) s;
		    	if (neuroMuscularSymptom.contains(symptomName)) return (NeuroMuscularSymptom) s;
		    	if (respiratorySymptom.contains(symptomName)) return (RespiratorySymptom) s;
		    }
	    }
	    
	    return null;
	}
	
}
