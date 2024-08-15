package ObserverPattern;

/*
 * All potential class which needs to subscribe to subject must implement this interface
 * 
 * It has only one method which will be called when anything in the subject class changes
 * 
 */
public interface Observer {
	
//	PUSH TECHNIQUE
//	public void update(float temp, float humidity, float pressure);
	
//	PULL Technique
	public void update();
}
