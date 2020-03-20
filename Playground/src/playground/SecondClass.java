package playground;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SecondClass {
	
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
	
	@Parameters({"URL"}) //Picks up the parameter defined in the TestNG XML file 
	@Test(timeOut=4000)
		public void class2method2(String urlname) // Whatever is stored in the "URL" will go into urlname and can be printed in the output (gets the data from the xml file 
			{
				System.out.println("class2: // method:2");	
				System.out.println(urlname);
			}
	
	@Test(dependsOnMethods= {"class2method4", "class2method2"})
	//Depends on other methods - runs after the other methods are finished running
		public void class2method3() 
			{
				System.out.println("class2: // method:3");	
			}
	
	@Parameters("RLU") // This parameter is only set-up for this tests and can only be used in theis class (check testng.xml for further details on initialization of the parameter)
	@Test(enabled=true)
		public void class2method4(String lruName)
			{
				System.out.println("class2: // method:4");	
				System.out.println(lruName);
			}
	
	@AfterTest
		public void methodAfter()
			{
				System.out.println("class2: // method after test rulata");	
			}
	
}