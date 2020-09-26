package mementomediatorpattern.design.behavioral.memento;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializableExample {

	public static void main(String[] args) {

		Employee employee = new Employee();
		employee.setName("Leonardo");
		employee.setAddress("123 de vinci");
		employee.setPhone("888-555-6789");
		
		serialize(employee);
		
		Employee newEmp = deserialize();
		
		System.out.println(newEmp);
	}

	private static Employee deserialize() {
		try {
			FileInputStream fileInputStream = new FileInputStream("/tmp/employee.ser");
			ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
			Employee emp =  (Employee) objectInputStream.readObject();
			
			objectInputStream.close();
			fileInputStream.close();
			
			return emp;
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		return null;
	}

	private static void serialize(Employee emp) {
		try {
			FileOutputStream fileOutputStream = new FileOutputStream("/tmp/employee.ser");
			ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
			objectOutputStream.writeObject(emp);
			objectOutputStream.close();
			fileOutputStream.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
