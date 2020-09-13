package pattern.design.behavioral.demo.approval;

public class ApprovalExample {

	public static void main(String[] args) {

		Director bryan = new Director();
		VP cystal = new VP();
		CEO jeff = new CEO();
		
		bryan.setSuccessor(cystal);
		cystal.setSuccessor(jeff);
		
		bryan.handleRequest(new Request(RequestType.CONFERENCE, 500));
		
		bryan.handleRequest(new Request(RequestType.PURCHASE, 1000));
		
		bryan.handleRequest(new Request(RequestType.PURCHASE, 2000));
		
	}

}
