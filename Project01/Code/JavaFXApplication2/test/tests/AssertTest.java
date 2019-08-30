package tests;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class AssertTest{ 
	
	
	
public class Assert {
	 
	 String temp, str;
	 int num;
	 

 	public void manin (String[] args) {

 		Result result = JUnitCore.runClasses(AssertTestR.class);


 		for (Failure failure: result.getFailures()) {

 			System.out.println(failure.toString());
		}

 		System.out.println(result.wasSuccessful());


 	}

 }



}