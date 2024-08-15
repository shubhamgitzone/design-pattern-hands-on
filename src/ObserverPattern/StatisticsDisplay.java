package ObserverPattern;

public class StatisticsDisplay implements DisplayElement, Observer {

	private float temperature;
	private float humidity;
	private float pressure;
	private WeatherData weatherData;

	public StatisticsDisplay(WeatherData weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}

//	push
//	@Override
//	public void update(float temp, float humidity, float pressure) {
//		this.temperature = temp;
//		this.humidity = humidity;
//		this.pressure = pressure;
//		display();
//	}

//	pull
	@Override
	public void update() {
		this.temperature = weatherData.getTemperature();
		this.humidity = weatherData.getHumidity();
		this.pressure = weatherData.getPressure();
		display();
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub

	}

}
