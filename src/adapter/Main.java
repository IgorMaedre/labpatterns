package adapter;

import java.util.ArrayList;
import java.util.Iterator;

import domain.*;

public class Main {
	
	
	public static void main(String[] args) {

		Covid19Pacient p = new Covid19Pacient("Iker", 35);
		Symptom s1 = new Symptom("fiebre", 5, (int)87.9);
		Symptom s2 = new Symptom("disnea", 3, (int)18.6);
		Symptom s3 = new Symptom("nauseas", 1, (int)5.0);
		Symptom s4 = new Symptom("tos seca", 5, (int)67.7);
		Symptom s5 = new Symptom("vomitos", 1, (int)4.8);
		
		p.addSymptom(s1, 1);
		p.addSymptom(s2, 1);
		p.addSymptom(s3, 1);
		p.addSymptom(s4, 1);
		p.addSymptom(s5, 1);
		
		Sorting sorter = new Sorting();
		
		CovidPacientInvIter cp1 = new CovidPacientInvIter(new ArrayList<Symptom>(p.getSymptoms()));
		SeverityIndexComparator sic = new SeverityIndexComparator();
		Iterator indexIterator = sorter.sortedIterator(cp1, sic);
		System.out.println("\nSorted by symptom index:\n");
		while(indexIterator.hasNext()) {
			Symptom s = (Symptom) indexIterator.next();
			int index = s.getSeverityIndex();
			System.out.println("- "+ index + "\n");
		}
		System.out.println("----------");
		
		CovidPacientInvIter cp2 = new CovidPacientInvIter(new ArrayList<Symptom>(p.getSymptoms()));
		SymptomNameComparator snc = new SymptomNameComparator();
		Iterator nameIterator = sorter.sortedIterator(cp2, snc);
		System.out.println("\nSorted by severity name:\n");
		while(nameIterator.hasNext()) {
			Symptom s = (Symptom) nameIterator.next();
			String name = s.getName();
			System.out.println("- "+ name + "\n");
		}
		System.out.println("----------");
	}

}
