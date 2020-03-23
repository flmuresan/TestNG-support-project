package playground;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

//ITestListener is an interface which implements TestNG listeners 

public class ListenersImplementation implements ITestListener {
	
@Override 
public void onTestStart (ITestResult result) {
	//TO DO 
}

@Override
public void onTestSuccess(ITestResult result) {  // CHeck with ">Groups smoke.xml" in order to see implementation in testNG xml
	//TO DO 
	System.out.println("Listener is working with success on success test!");
}

@Override 
public void onTestFailure (ITestResult result) {
	//TO DO
//	screenshot code 
//	response if API is failing 
	System.out.println("Listener is working on a failed smoke tests (it has an assert which is false, so it fails)" + "  " + result.getName());  // check with class1method1 from FirstClass 
}

@Override
public void onTestSkipped(ITestResult result) {
	//TO DO
}

@Override 
public void onTestFailedButWithinSuccessPercentage (ITestResult result) {
	//TO DO 
}

@Override 
public void onStart(ITestContext context) {
	//TO DO
}

@Override 
public void onFinish(ITestContext context) {
	//TO DO
}
}
