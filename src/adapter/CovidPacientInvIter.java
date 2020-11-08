package adapter;

import java.util.List;

import domain.Symptom;

public class CovidPacientInvIter implements InvertedIterator {
	
	List<Symptom> symptoms;
	int position;
	
	public CovidPacientInvIter (List<Symptom> simp) {
		this.symptoms = simp;
		this.position = simp.size() - 1;
	}

	@Override
	public Object previous() {
		Symptom simp = symptoms.get(position);
		position--;
		return simp;
	}

	@Override
	public boolean hasPrevious() {
		return (position >= 0);
	}

	@Override
	public void goLast() {
		position = symptoms.size() - 1;
	}

}
