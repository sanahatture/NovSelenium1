import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class LaunchChromeBrowser {
	static WebDriver driver = null;
	 
    String URL = "https://manytools.org/http-html-text/browser-language/";

    public static String status = "passed";

    public String username = "user-name";

    public static String access_key = "access-key";
		  
	public static void main(String[] args) throws MalformedURLException{
		// TODO Auto-generated method stub
		 
		 	    
		         ChromeOptions chromeOptions = new ChromeOptions();
		 
		         chromeOptions.addArguments("--lang=he-IL");
		 
		         chromeOptions.setCapability("build", "[Java] Locale Testing with Chrome & Windows on BetaTest Selenium Grid");
		 
		         chromeOptions.setCapability("name", "[Java] Locale Testing with Chrome & Windows on BetaTest Selenium Grid");
		 
		         chromeOptions.setCapability("platform", "Windows 10.0");
		 
		         chromeOptions.setCapability("browserName", "Chrome");
		 
		         chromeOptions.setCapability("version","89.0");
		 
		         chromeOptions.setCapability("tunnel",false);
		 
		       // chromeOptions.setCapability("network",true);
		 
		 //        chromeOptions.setCapability("console",true);
		 
		         chromeOptions.setCapability("visual",true);
		 
		  
		 
		        // driver = new RemoteWebDriver(chromeOptions);
		 
		         System.out.println("Started session");
		 
		     
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Required Drivers\\chromedriver.exe");
		
		driver=new ChromeDriver(chromeOptions);
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("sana.hatture@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("12345678");
		String facebook_text=driver.findElement(By.xpath("//h2[@class='_8eso']")).getText();
		//driver.findElement(By.xpath("//*[@name=\"login\"]")).click();
		//driver.findElement(By.name("login")).click();
		//driver.findElement(By.linkText("Forgot Password?")).click();
		String link_text=driver.findElement(By.className("_8esh")).getText();
		//driver.findElement(By.linkText("Create New Account")).click();
		driver.findElement(By.partialLinkText("Create New")).click();
		System.out.println(link_text);
		//System.out.print(facebook_text);
		
	     
	     
		
	}

}
