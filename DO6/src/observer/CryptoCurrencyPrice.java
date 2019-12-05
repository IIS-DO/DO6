package observer;

import java.util.ArrayList;
import java.util.List;

public class CryptoCurrencyPrice implements Subject{
	private double bitcoinPrice;
	private double etherPrice;
	
	private List<Observer> observers;
	
	public double getBitcoinPrice() {
		return bitcoinPrice;
	}

	public void setBitcoinPrice(double bitcoinPrice) {
		this.bitcoinPrice = bitcoinPrice;
		notifyObservers();
	}

	public double getEtherPrice() {
		return etherPrice;
	}

	public void setEtherPrice(double etherPrice) {
		this.etherPrice = etherPrice;
		notifyObservers();
	}

	public CryptoCurrencyPrice() {
		observers = new ArrayList<Observer>();
	}

	@Override
	public void addObserver(Observer observer) {
		observers.add(observer);
	}

	@Override
	public void removeObserver(Observer observer) {
		observers.remove(observer);
	}

	@Override
	public void notifyObservers() {
		for (Observer observer : observers) {
			observer.update(bitcoinPrice, etherPrice);
		}
		
	}

}
