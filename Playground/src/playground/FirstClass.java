package playground;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class FirstClass {
	
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
	
	@Parameters({"test", "test2"}) 
	// Two parameters are added in the TesstNG.xml file and now are used in the test 
	@Test
	public void class1method2(String testa, String testb) 
		{
			System.out.println("class1: // method:2");
			System.out.println(testa);
			System.out.println(testb);
		}
	
	@Test(dataProvider="getData") //get the data from the array in your own test 
	public void class1method3(String username, String password) // catch the username and password (1st and 2nd parameters from the array combination
		{
			System.out.println("class1: // method:3");	
			System.out.println(username); //will run 3 times 
			System.out.println(password);// will run 3 times for the combinations defind in the array
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
	
	
	@DataProvider  //If there are any dependencies with the xml file (i.e. other parameters set-up in the xml file), run it from the xml file as it will fail if not
	public Object[][] getData()
	{
		//1st combination - username and password - i.e. good credit history = row
		//2nd combination - username password - i.e. no credit history
		//3rd combination - username password - i.e. fraudulent history
		Object[][] data=new Object[3][2];  // This is where the array is created which stores [3] - number of combinations and [2] - parameters received in combination [array with 3 rows and 2 columns]
		//1st set
		data[0][0]="firstUsername";  
			//1st [0] states for 1st index
		data[0][1]="password";
			//[1] states for the password  - columns in the row are nothing that values for that particular combination
		
		//2nd set 
		data[1][0]="2ndUsername";
		data[1][1]="password";
		
		//3rd set
		data[2][0]="3rdUsername";
		data[2][1]="password";
		return data;
		
	}
}
