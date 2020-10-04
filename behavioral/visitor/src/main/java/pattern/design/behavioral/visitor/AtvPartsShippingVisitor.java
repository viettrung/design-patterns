package pattern.design.behavioral.visitor;

public class AtvPartsShippingVisitor implements AtvPartVisitor {

	double shippingCost = 0;

	@Override
	public void visit(Fender fender) {
		shippingCost += 3;
		System.out.println("Fenders are light and cheap to ship");
	}

	@Override
	public void visit(Wheel wheel) {
		shippingCost += 15;
		System.out.println("Wheels are builky and expensive to ship");
	}

	@Override
	public void visit(Oil oil) {
		shippingCost += 9;
		System.out.println("Oil is hazardous and has a fee to ship");
	}

	@Override
	public void visit(PartsOrder partsOrder) {

		System.out.println("If they bought more than 3 things we will give them a discount on shipping");
		if (partsOrder.getParts().size() > 3) {
			shippingCost -= 5;
		}

		System.out.println("Shipping cost is: " + shippingCost);
	}

}
