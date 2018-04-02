import org.apache.logging.log4j.core.util.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class PropertyCheckAndSet {

  public static WebDriver driver;
  public static Properties property;


  public static WebDriver initialiseDriver() throws IOException {

    property = new Properties();
    FileInputStream fis = new FileInputStream("C:\\Users\\Luxmy\\IdeaProjects\\ciautotest\\src\\resources\\data.properties");
    property.load(fis);
    String browser = property.getProperty("browser");
    if(browser.equals("chrome")){

      System.setProperty("webdriver.chrome.driver","C:\\Users\\Luxmy\\Downloads\\chromdrive2_35\\chromedriver_win32\\chromedriver.exe");
      driver = new ChromeDriver();
      }
    if(browser.equals("firefox")){

      System.setProperty("webdriver.chrome.driver","C:\\Users\\Luxmy\\Downloads\\geckodriver-v0.20.0-win32\\geckodriver.exe");
      driver = new FirefoxDriver();
    }

    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    return driver;
  }
  /**
  public void takeScreenshot(String result){

      File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

  }
   **/
}
