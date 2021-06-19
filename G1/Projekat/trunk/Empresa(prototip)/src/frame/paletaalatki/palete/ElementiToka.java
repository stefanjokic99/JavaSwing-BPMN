package frame.paletaalatki.palete;

import java.awt.GridLayout;

import javax.swing.JPanel;

import frame.paletaalatki.Element;

public class ElementiToka extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	//aktivnosti
	Element podproces = null;
	Element pozivAktivnosti = null;
	Element transakcija = null;
	Element zadatak = null;
	
	//dogadjaji
	Element pocetakDogadjaja = null;
	Element medjudogadjaj = null;
	Element krajDogadjaja = null;
	
	//kapije
	Element xorGateway = null;
	Element orGateway = null;
	Element exclusiveGatewayBasedOnEvent = null;
	Element exclusiveGatewayBasedOnData = null;
	Element complexGateway = null;
	Element parallelGateway = null;
	
	public ElementiToka() {

		setLayout(new GridLayout(0, 2));
		
		podproces = new Element("elementi toka/podproces (sub-process)");
		podproces.setToolTipText("<html><i>podproces</i></html>");
		
		pozivAktivnosti = new Element("elementi toka/poziv aktivnosti (call activity)");
		pozivAktivnosti.setToolTipText("<html><i>poziv aktivnosti</i></html>");
		
		transakcija = new Element("elementi toka/transakcija (transaction)");
		transakcija.setToolTipText("<html><i>transakcija</i></html>");
		
		zadatak = new Element("elementi toka/zadatak (task)");
		zadatak.setToolTipText("<html><i>zadatak</i></html>");
		
		add(podproces);
		add(pozivAktivnosti);
		add(transakcija);
		add(zadatak);
		
		pocetakDogadjaja = new Element("elementi toka/pocetak dogadjaja (start event)");
		pocetakDogadjaja.setToolTipText("<html><i>početak događaja</i></html>");
		
		medjudogadjaj = new Element("elementi toka/medjudogadjaj (intermediate event)");
		medjudogadjaj.setToolTipText("<html><i>medjudogađaj</i></html>");
		
		krajDogadjaja = new Element("elementi toka/kraj dogadjaja (end event)");
		krajDogadjaja.setToolTipText("<html><i>kraj događaja</i></html>");
				
		add(pocetakDogadjaja);
		add(medjudogadjaj);
		add(krajDogadjaja);
		
		xorGateway = new Element("elementi toka/ekskluzivno ili kapija (xor gateway)");
		xorGateway.setToolTipText("<html><i>ekskluzivno ili kapija</i></html>");
		
		orGateway = new Element("elementi toka/ili kapija (or gateway)");
		orGateway.setToolTipText("<html><i>ili kapija</i></html>");
		
		exclusiveGatewayBasedOnEvent = new Element("elementi toka/kapija odluke na osnovu dogadjaja (exclusive gateway based on event)");
		exclusiveGatewayBasedOnEvent.setToolTipText("<html><i>kapija odluke na osnovu događaja</i></html>");
		
		exclusiveGatewayBasedOnData = new Element("elementi toka/kapija odluke na osnovu podatka (exclusive gateway based on data)");
		exclusiveGatewayBasedOnData.setToolTipText("<html><i>kapija odluke na osnovu podataka</i></html>");
		
		complexGateway = new Element("elementi toka/kompleksna kapija (complex gateway)");
		complexGateway.setToolTipText("<html><i>kompleksna kapija</i></html>");
		
		parallelGateway = new Element("elementi toka/paralelna kapija (parallel gateway)");
		parallelGateway.setToolTipText("<html><i>paralelna kapija</i></html>");
		
		add(xorGateway);
		add(orGateway);
		add(exclusiveGatewayBasedOnEvent);
		add(exclusiveGatewayBasedOnData);
		add(complexGateway);
		add(parallelGateway);
	}

}
