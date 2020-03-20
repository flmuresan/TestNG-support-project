package playground;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class aDouaClasa {
	
	@BeforeTest(enabled=false)
		public void methodBefore()
			{
				System.out.println("class2: // method before test rulata");
			}
		
	@Test(groups= {"smoke"})
		public void class2method1()
			{
				System.out.println ("class:2 // method:1");
			}
	
	@Test 
		public void class2method2() 
			{
				System.out.println("class2: // method:2");	
			}
	
	@Test(dependsOnMethods= {"class2method4", "class2method2"})
		public void class2method3() 
			{
				System.out.println("class2: // method:3");	
			}
	
	@Test(enabled=true)
		public void class2method4()
			{
				System.out.println("class2: // method:4");	
			}
	
	@AfterTest
		public void methodAfter()
			{
				System.out.println("class2: // method after test rulata");	
			}
	
}