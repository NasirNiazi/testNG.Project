package TestCases;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.ResourceBundle;
import java.util.logging.LogManager;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class TestBase {
	public static WebDriver driver;
	public Logger logger;
	public ResourceBundle rb;
	@BeforeClass(groups= {"Sanity","Regression"})
	@Parameters("browser")
	public void setup(String br) 
	{
		rb=ResourceBundle.getBundle("config");
		logger=org.apache.logging.log4j.LogManager.getLogger(this.getClass());
		if(br.equals("chrome")) {
			driver = new ChromeDriver();
		}else if (br.equals("edge")) {
			driver= new EdgeDriver();
		}else 
		{
			driver=new FirefoxDriver();
		}
		//ChromeOptions options=new ChromeOptions();
		//options.setExperimentalOption("excludeSwitches",new String[] {"enable-automation"});
		
//		WebDriverManager.chromedriver().setup();
//		driver=new ChromeDriver();
		
		
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get(rb.getString("appurl1"));
		//driver.get("https://demo.opencart.com/index.php");
		driver.manage().window().maximize();
		
	}
	
	@AfterClass(groups= {"Master","Regression"})
	public void tearDown()
	{
		driver.quit();
	}
	//baseclass contaian reusable contains 
public String randomString() 
{
	String randomString= RandomStringUtils.randomAlphabetic(10);
	return randomString;
	}
public String randomNumber(){
String randomSNumber=RandomStringUtils.randomNumeric(10);

return randomSNumber;
    }
   public String randomStringAndNUmber() 
   {
	   String randomStr= RandomStringUtils.randomAlphabetic(5);
	   String randomSNum=RandomStringUtils.randomNumeric(5);
	   return randomStr+"@"+randomSNum;
   }
   
   public String captureScreen(String tname )throws IOException
   {
//		SimpleDateFormat df = new SimpleDateFormat("yyyymmddhhmmss");
//		Date dt = new Date();
//		String timestam=df.format(dt);	
	  String timeStamp = new SimpleDateFormat("yyyymmddhhmmss").format(new Date());
	  TakesScreenshot takeScreenshot=(TakesScreenshot)driver;
	  File source = takeScreenshot.getScreenshotAs(OutputType.FILE);
	  String destanition= System.getProperty("user.dir")+"//screenShots//"+"tname"+"_"+"timeStamp"+".png";
	  try {
	  FileUtils.copyFile(source, new File (destanition));
	  }catch (Exception e) 
	  {
		  e.getMessage();
	  }
	  return destanition;
   }


}



   
