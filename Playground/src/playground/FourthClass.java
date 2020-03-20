package playground;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FourthClass {
	
	@BeforeClass
	public void beforeClass ()
	{
		System.out.println("This runs before class");
	}
	
	@AfterClass
	public void afterClass ()
	{
		System.out.println("This runs after class");
	}
	
	@BeforeTest
	public void methodBefore()
	{
	System.out.println("class4: // method before test rulata");
	}
	
	@Test(groups= {"smoke"})
	public void class4method1()
	{
	System.out.println ("class:4 // method:1");
	}
	
	@Test 
	public void class4method2() 
	{
	System.out.println("class4: // method:2");	
	}
	
	@Test 
	public void class4method3() 
	{
	System.out.println("class4: // method:3");	
	}
	
	@Test public void class4method4()
	{
	System.out.println("class4: // method:4");	
	}
	
	@AfterTest
	public void methodAfter()
	{
	System.out.println("class1: // method after test rulata");	
	}
	
}