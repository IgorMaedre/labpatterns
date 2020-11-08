package adapter;

import java.util.Comparator;

import domain.Symptom;

public class SeverityIndexComparator implements Comparator<Object> {

	@Override
	public int compare(Object o1, Object o2) {
		Symptom s1 = (Symptom) o1;
		Symptom s2 = (Symptom) o2;
		int i1 = s1.getSeverityIndex();
		int i2 = s2.getSeverityIndex();
		
		if (i1 > i2) return 1;
		else if (i1 < i2) return -1;
		else return 0;
	}

}
