package adapter;

import java.util.Comparator;

import domain.Symptom;

public class SymptomNameComparator implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		Symptom s1 = (Symptom) o1;
		Symptom s2 = (Symptom) o2;
		String str1 = s1.getName();
		String str2 = s2.getName();
		return str1.compareTo(str2);
	}

}
