package pattern.design.behavioral.observer.observable;

import java.util.Observable;
import java.util.Observer;

public class ObservableExample {

	public static void main(String[] args) {

		TweeterStream messageStream = new TweeterStream();

		Client client1 = new Client("Jess");
		Client client2 = new Client("Scott");

		messageStream.addObserver(client1);
		messageStream.addObserver(client2);

		messageStream.someoneTweeted();
	}

}

// concrete subject
class TweeterStream extends Observable {

	public void someoneTweeted() {
		setChanged();
		notifyObservers();
	}
}

// concrete observer
class Client implements Observer {
	private String name;

	Client(String name) {
		this.name = name;
	}

	@Override
	public void update(Observable o, Object arg) {

		System.out.println("Update " + name + "'s stream, someone tweeted something.");
	}

}