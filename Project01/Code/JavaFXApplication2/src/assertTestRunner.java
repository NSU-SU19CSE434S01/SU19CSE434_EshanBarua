import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class assertTestRunner {
	
	public static void manin (String[] args) {
	  
		Result result = JUnitCore.runClasses(assertTest.class);
		
		
		for (Failure failure: result.getFailures()) {
			
			System.out.println(failure.toString());
		}
		
		System.out.println(result.wasSuccessful());
		
		
	}

}
