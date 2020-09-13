package pattern.design.behavioral.demo.approval;

public class Director extends Handler {

	@Override
	public void handleRequest(Request request) {

		if (request.getRequestType() == RequestType.CONFERENCE) {
			System.out.println("Directors can approve conferences");
		} else {
			successor.handleRequest(request);
		}
	}

}
