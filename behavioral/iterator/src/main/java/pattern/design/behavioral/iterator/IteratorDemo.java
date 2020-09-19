package pattern.design.behavioral.iterator;

import java.util.Iterator;

public class IteratorDemo {

	public static void main(String[] args) {

		BikeRepository bikeRepository = new BikeRepository();
		
		bikeRepository.addBike("Fuji");
		bikeRepository.addBike("Cervelo");
		bikeRepository.addBike("Giant");
		
		Iterator<String> bikesIterator = bikeRepository.iterator();
		
		while(bikesIterator.hasNext()) {
			System.out.println(bikesIterator.next());
		}

	}

}
