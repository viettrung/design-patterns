package pattern.design.behavioral.interpreter;

public class InterpreterDemo {

	static Expression buildInterpreterTree() {
		Expression lionsExpression = new TerminalExpression("Lions");
		Expression tigerExpressions = new TerminalExpression("Tigers");
		Expression bearsExpression = new TerminalExpression("Bears");
		
		// Tigers and Bears
		Expression tigersAndBearsExpr = new AndExpression(tigerExpressions, bearsExpression);

		// Lions or (Tigers and Bears)
		Expression lionsOrTigersAndBearsExpr = new OrExpression(lionsExpression, tigersAndBearsExpr);
		
		return new AndExpression(bearsExpression, lionsOrTigersAndBearsExpr);
	}
	
	public static void main(String[] args) {
		
		Expression define = buildInterpreterTree();
		
		String context = "Tigers";
		System.out.println(context + " is " + define.interpret(context));
		
		context = "Lions";
		System.out.println(context + " is " + define.interpret(context));

		context = "Bears";
		System.out.println(context + " is " + define.interpret(context));
		
		context = "Tigers Lions";
		System.out.println(context + " is " + define.interpret(context));

		context = "Tigers Bears";
		System.out.println(context + " is " + define.interpret(context));

		context = "Lions Bears";
		System.out.println(context + " is " + define.interpret(context));
	}

}
