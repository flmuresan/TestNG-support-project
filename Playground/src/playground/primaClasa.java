package playground;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class primaClasa {
	
	@BeforeSuite 
	//Runs before running the test suite 
	public void BFsuite ()
	{
	System.out.println("I am the 1st thing that is being run in here!");
	}
	
	@BeforeTest 
	//Runs before running the test 
	public void MethodBefore()
	{
	System.out.println("class1: // method before test rulata");
	}
	
	@BeforeMethod 
	//Runs before running the methods
	public void Before()
	{
	System.out.println("class1: // I am before method, crazy method!");
	}
	
	@Test(groups= {"smoke"})
	//Makes the test as being part of a group - from xml, you can run only tests being part of a group - i.e. smoke, regression, sanity etc 
	public void class1method1()
	{
	System.out.println ("class:1 // method:1");
	}
	
	@Test
	public void class1method2() 
	{
	System.out.println("class1: // method:2");	
	}
	
	@Test 
	public void class1method3() 
	{
	System.out.println("class1: // method:3");	
	}
	
	@Test public void class1method4()
	{
	System.out.println("class1: // method:4");	
	}
	
	@AfterMethod 
	//Runs after the method is ran
	public void After()
	{
	System.out.println("class1: // I am after method, craziest method!!!");
	}
	
	@AfterTest
	//Runs after the test is ran (the last one to run)
	public void methodAfter()
	{
	System.out.println("class1: // method after test rulata");	
	}
	
	@AfterSuite
	//Runs after the suite is run
	public void AFsuite ()
	{
		System.out.println("I am the last one in the chain!!!");
	}
	
}
