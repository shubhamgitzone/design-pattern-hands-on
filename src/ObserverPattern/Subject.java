package ObserverPattern;

/*
 * Subject ---> Publisher 
 * 
 * this interface acts as the primary publisher 
 * that can be implemented by multiple concrete Subjects 
 * to prepare a pub-sub. 
 * 
 * Each subject can have many observers. Hence, one to many relation.
 * 
 * Here, we have 3 basic methods that each subject should have: 
 * 1. register
 * 2. de-register
 * 3. notify
 * 
 */
public interface Subject {

	public void registerObserver(Observer o);

	public void removeObserver(Observer o);

	public void notifyObserver();
}
