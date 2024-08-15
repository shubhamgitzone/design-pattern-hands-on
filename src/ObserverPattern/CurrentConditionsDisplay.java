package ObserverPattern;

/*
 * this concrete implentation of observer must register itself with concrete subject to recive updates.
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement {

	private float temperature;
	private float humidity;
	private WeatherData weatherData;

	public CurrentConditionsDisplay(WeatherData weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}

//	push
//	@Override
//	public void update(float temp, float humidity, float pressure) {
//		this.temperature = temp;
//		this.humidity = humidity;
//		display();
//	}

//	pull
	@Override
	public void update() {
		this.temperature = weatherData.getTemperature();
		this.humidity = weatherData.getHumidity();
		display();
	}

	@Override
	public void display() {
		System.out.println("Current conditions: " + temperature + "F degrees and " + humidity + "%humidity");
	}

}
