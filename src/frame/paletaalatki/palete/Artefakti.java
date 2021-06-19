package frame.paletaalatki.palete;

import java.awt.GridLayout;

import javax.swing.JPanel;

import frame.paletaalatki.Element;

public class Artefakti extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	Element anotacija = null;
	Element grupa = null;
	Element izlazniPodaci = null;
	Element objektPodataka = null;
	Element skladistePodataka = null;
	Element ulazniPodaci = null;
	
	public Artefakti() {
		
		setLayout(new GridLayout(0, 2));
		
		anotacija = new Element("artefakti/anotacija (annotation)");
		anotacija.setToolTipText("<html><i>anotacija</i></html>");
		
		grupa = new Element("artefakti/grupa (group)");
		grupa.setToolTipText("<html><i>grupa</i></html>");
		
		skladistePodataka = new Element("artefakti/skladiste podataka (data store)");
		skladistePodataka.setToolTipText("<html><i>skladiste podataka</i></html>");
		
		objektPodataka = new Element("artefakti/objekt podataka (data object)");
		objektPodataka.setToolTipText("<html><i>objekt podataka</i></html>");
		
		ulazniPodaci = new Element("artefakti/ulazni podaci (data input)");
		ulazniPodaci.setToolTipText("<html><i>ulazni podaci</i></html>");
	
		izlazniPodaci = new Element("artefakti/izlazni podaci (data output)");
		izlazniPodaci.setToolTipText("<html><i>izlazni podaci</i></html>");
		
		add(anotacija);
		add(grupa);
		add(skladistePodataka);
		add(objektPodataka);
		add(ulazniPodaci);
		add(izlazniPodaci);
		
	}

}
