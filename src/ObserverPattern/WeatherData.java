package ObserverPattern;

import java.util.ArrayList;
import java.util.List;

/*
 * this is a concrete subject. 
 * 
 *  (LOOSE COUPLING) 
 * 		Subject doesn't know the concrete implementation of observers.
 * 		Just knowing that it implements Observer Interface is enough.
 * 
 * 		Observer can be added or removed at any time without modifying the subject
 * 
 * 		Subject as well as Observer can be used independently of each other,
 * 		Changes to either of them will not affect the other.
 *  (LOOSE COUPLING) 
 * 
 * In additonal basic subject method implementation,
 * the concrete subject may have methods for setting and getting its state.
 * 
 */
public class WeatherData implements Subject {

	private List<Observer> observers;
	private float temperature;
	private float humidity;
	private float pressure;

	public WeatherData() {
		observers = new ArrayList<Observer>();
	}

	//getters for implementing pull
	public float getTemperature() {
		return temperature;
	}

	public float getHumidity() {
		return humidity;
	}

	public float getPressure() {
		return pressure;
	}

	public void registerObserver(Observer o) {
		observers.add(o);
	}

	public void removeObserver(Observer o) {
		observers.remove(o);
	}

	/*
	 * notifyObservers will be used to call the observer in subject's have a state change
	 * 
	 * here having an interface helped us omitting different calls to obeserver
	 */
	public void notifyObserver() {
		for (Observer observer : observers) {
//			observer.update(temperature, humidity, pressure); //push
			observer.update(); // pull
		}
	}

	public void measurementChanged() {
		notifyObserver();
	}

	public void setMeasurements(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementChanged();
	}

}
