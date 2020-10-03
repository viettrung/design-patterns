package pattern.design.behavioral.template;

public class StoreOrder extends OrderTemplate {

	@Override
	public void doCheckout() {
		System.out.println("Ring up items from cart.");
	}

	@Override
	public void doPayment() {
		System.out.println("Process payment with card present");
	}

	@Override
	public void doRecept() {
		System.out.println("Print receipt");
	}

	@Override
	public void doDelivery() {
		System.out.println("Bag items at couter");
	}

}
