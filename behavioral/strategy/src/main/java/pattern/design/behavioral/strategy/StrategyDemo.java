package pattern.design.behavioral.strategy;

public class StrategyDemo {

	public static void main(String[] args) {

		CreditCard amexCard = new CreditCard(new AmexStrategy());

		amexCard.setNumber("379185883464283");
		amexCard.setDate("04/2020");
		amexCard.setCvv("123");

		System.out.println("Is Amex valid: " + amexCard.isValid());

		CreditCard amexCard2 = new CreditCard(new AmexStrategy());

		amexCard2.setNumber("379185883464123");
		amexCard2.setDate("04/2018");
		amexCard2.setCvv("198");

		System.out.println("Is Amex valid: " + amexCard2.isValid());

		CreditCard visaCard = new CreditCard(new VisaStrategy());

		visaCard.setNumber("4539589763663402");
		visaCard.setDate("04/2025");
		visaCard.setCvv("899");

		System.out.println("Is Visa valid: " + visaCard.isValid());
	}

}
