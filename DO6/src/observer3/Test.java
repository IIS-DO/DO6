package observer3;

public class Test {

	public static void main(String[] args) {
		CryptoCurrencyPrice cryptoCurrencyPrice = new CryptoCurrencyPrice();
		CryptoCurrencyUpdateSMS cryptoCurrencyUpdateSMS = new CryptoCurrencyUpdateSMS();
		cryptoCurrencyPrice.addPropertyChangeListener(cryptoCurrencyUpdateSMS);
		
		cryptoCurrencyPrice.setBitcoinPrice(15000);

	}

}
