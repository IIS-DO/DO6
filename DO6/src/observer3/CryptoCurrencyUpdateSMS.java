package observer3;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class CryptoCurrencyUpdateSMS implements PropertyChangeListener {
	private double bitcoinPrice;
	private double etherPrice;

	@Override
	public void propertyChange(PropertyChangeEvent evt) {
		if (evt.getPropertyName().equals("bitcoinPrice")) {
			bitcoinPrice = (double)evt.getNewValue();
			sendSMS();
		}
		if (evt.getPropertyName().equals("etherPrice")) {
			etherPrice = (double)evt.getNewValue();
			sendSMS();
		}
		
	}
	
	public void sendSMS() {
		System.out.println("Bitcoin price: " + bitcoinPrice);
		System.out.println("Ether price: " + etherPrice);
	}

}
