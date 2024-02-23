package Seliniumlogin1.Seliniumlogin1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Seliniummaven  {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sride\\OneDrive\\Desktop\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();		
	    driver.get("https://demoqa.com/login");	
	    driver.manage().window().maximize();
		
		driver.findElement(By.id("userName")).sendKeys("deepthi");

		driver.findElement(By.id("password")).sendKeys("Vamsideepu@7");
		

		driver.findElement(By.id("login")).click();
		
		
		
	
		
		
//		System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver");     
//		WebDriver driver = new ChromeDriver(); 
//
//		  driver.get("http://www.google.com/");    

//		  Thread.sleep(5000);  // Let the user actually see something!     
//
//		  WebElement searchBox = driver.findElement(By.name("q"));
//
//		  searchBox.sendKeys("ChromeDriver");     
//
//		  searchBox.submit();    
//
//		  Thread.sleep(5000);  // Let the user actually see something!     
//
//		  driver.quit();
		
		
		

	}

}

