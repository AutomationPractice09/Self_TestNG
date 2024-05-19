package Package_1905;

import org.testng.Assert;
import org.testng.annotations.Test;

public class A3_TestngAttribute 
{
  @Test (priority = 1)                                    //here we add priority Attribute for all test cases so test case can run in correct order
  public void registration() 
  {
	  System.out.println("This is a Registration Process");
	  Assert.assertEquals(false, true);                       //here we failed the test case of registration to see whether login() test case will skip or not
  }
  
  @Test (priority = 2,dependsOnMethods = "registration()")   //here we have given dependency attribute also, so if registration() test case pass then only login test case run and if registration() test case fails then login() test case skip to execute
  public void login() 
  {
	  System.out.println("This is a Login Process");
  }
  
  @Test (priority = 3)
  public void search() 
  {
	  System.out.println("This is a Search Process");
  }
  
  @Test (priority = 4)
  public void addToCart() 
  {
	  System.out.println("This is a Add to Cart Process");
  }
}
