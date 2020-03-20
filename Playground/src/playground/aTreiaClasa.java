package playground;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class aTreiaClasa {
	
	@BeforeTest
	public void methodBefore()
	{
	System.out.println("class3: // method before test rulata");
	}
	
	@Test
	public void class3method1()
	{
	System.out.println ("class:3 // method:1");
	}
	
	@Test(groups= {"smoke"})
	public void class3method2() 
	{
	System.out.println("class3: // method:2");	
	}
	
	@Test 
	public void class3method3() 
	{
	System.out.println("class3: // method:3");	
	}
	
	@Test public void class3method4()
	{
	System.out.println("class3: // method:4");	
	}
	
	@AfterTest
	public void methodAfter()
	{
	System.out.println("class3: // method after test rulata");	
	}
	
}