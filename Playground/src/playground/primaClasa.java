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
	public void BFsuite ()
	{
	System.out.println("I am the 1st thing that is being run in here!");
	}
	
	@BeforeTest
	public void MethodBefore()
	{
	System.out.println("class1: // method before test rulata");
	}
	
	@BeforeMethod
	public void Before()
	{
	System.out.println("class1: // I am before method, crazy method!");
	}
	
	@Test(groups= {"smoke"})
	public void class1method1()
	{
	System.out.println ("class:1 // method:1");
	}
	
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
	public void After()
	{
	System.out.println("class1: // I am after method, craziest method!!!");
	}
	
	@AfterTest
	public void methodAfter()
	{
	System.out.println("class1: // method after test rulata");	
	}
	
	@AfterSuite
	public void AFsuite ()
	{
		System.out.println("I am the last one in the chain!!!");
	}
	
}
