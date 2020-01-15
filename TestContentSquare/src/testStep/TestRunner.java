package testStep;

import org.junit.runner.JUnitCore;		
import org.junit.runner.Result;		
import org.junit.runner.notification.Failure;	
import testStep.StepHomePage;

public class TestRunner {				
	public static void main(String[] args) {									
		Result result = JUnitCore.runClasses(StepHomePage.class);					
		for (Failure failure : result.getFailures()) {							
			System.out.println(failure.toString());					
		}		
		System.out.println("Result=="+result.wasSuccessful());							
	}		
}      	