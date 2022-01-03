import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class First {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 	// IE
		//System.setProperty("webdriver.ie.driver","C:\\Kriti\\pheonix\\Selenium Webdrivers\\IEDriverServer_x64_4.0.0\\IEDriverServer.exe");
	 	//WebDriver  driver = new InternetExplorerDriver();
		//Chrome
		 System.setProperty("webdriver.chrome.driver", "C:\\Kriti\\pheonix\\Selenium_Webdrivers\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver(); 
	 
	 	// EdgeC:\Kriti\pheonix\Selenium Webdrivers\edgedriver_win64
		//System.setProperty("webdriver.edge.driver", "C:\\Kriti\\pheonix\\Selenium_Webdrivers\\edgedriver_win64\\msedgedriver.exe");
	 	//WebDriver driver = new EdgeDriver();
		String actualTitle = "";
		 driver.navigate().to("https://www.google.com");
		 driver.findElement(By.name("q")).sendKeys("javatpoint tutorials");
		 driver.switchTo().defaultContent();
		 driver.findElement(By.name("btnK")).click();
		 // get the actual value of the title
	        actualTitle = driver.getTitle();
	        System.out.println(actualTitle);
	        String resultcheck ="";
	        resultcheck=driver.findElement(By.id("rso")).getText();
	        if(resultcheck.contains("https://www.javatpoints.com"))
	        	System.out.println("Test Passed!");
	         else 
	            System.out.println("Test Failed");	
	        if (actualTitle.contentEquals("javatpoint tutorials - Google Search"))
	           System.out.println("2Test Passed!");
	         else 
	            System.out.println("2Test Failed");
	        
	       
	        //close Fire fox
	        driver.close();
	}

}
