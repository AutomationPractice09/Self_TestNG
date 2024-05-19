package Package_1905;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class A2_BrowserOpen 
{
  @Test (priority=2)                            //here we have given priority 2 for this test case for execution
  public void chromeTest() 
  {
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://www.google.com/");
	  
  }
  
  @Test (priority=1)
  public void edgeTest() 
  {
	  WebDriver driver = new EdgeDriver();
	  driver.get("https://ww.google.com/");
  }
  
}
