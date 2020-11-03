package observer;

import java.awt.Color;
import java.awt.Frame;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JFrame;

import domain.Covid19Pacient;


public class SemaphorGUI extends JFrame implements Observer{
	/** stores the associated ConcreteSubject */
	public SemaphorGUI (int h, int w, Observable obs) {
		setSize(h, w);
		setLocation(350,10);
		Color c=Color.green;
		getContentPane().setBackground(c);
		repaint();
		setVisible(true);
		obs.addObserver(this);
	}
	
	public void update(Observable o, Object arg) {
		Covid19Pacient p = (Covid19Pacient) o;
		int x = (int) p.covidImpact();
		Color c = Color.green;
		if (x < 5) c = Color.green;
		else if (5 <= x && x < 10) c = Color.yellow;
		else if (x >= 10) c = Color.red;
		getContentPane().setBackground(c);
	}
}     

