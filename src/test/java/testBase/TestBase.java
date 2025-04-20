package testBase;


import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class TestBase 
{
	public WebDriver driver;
	public Properties pt;
	public Logger logger;
	
	@BeforeTest
	public void setup  () throws IOException
	{
		
		driver= new ChromeDriver();
		//to capture logs
		logger= LogManager.getLogger(this.getClass());
		
		//to read the URL from property file
		pt= new Properties();
		FileReader file= new FileReader("./src/test/resources/Configuration.properties");
		pt.load(file);
		driver.get(pt.getProperty("URL"));
		//driver.get("https://tutorialsninja.com/demo/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); 
	}
	
	@AfterTest
	public void TearDown()
	{
		driver.close();
	}
	
}
