package testNG;


import org.testng.Reporter;

import org.testng.annotations.Test;

public class SoftAssertStudy {
  @Test(invocationCount = 3 )
  public void A () 
  {
	  Reporter.log("I am A Method", true);
	  
  }
  @Test(priority = -1)
  public void B() 
  {
	  Reporter.log("I am B Method", true);
	  Reporter.log("I am Satish");
	  System.out.println("I am Print Stetment");
  }
  @Test (enabled = false)
  public void C() 
  {
	  Reporter.log("I am C Method", true);
	  Reporter.log("I am Laxman");
	  System.out.println("I am Print Stetment");
  }
  @Test (timeOut = 1200)
  public void D() throws InterruptedException 
  {
	  Thread.sleep(1100);
	  Reporter.log("I am D Method",true);
	  Reporter.log("I am Deshmukh");
	  System.out.println("I am Print Stetment");
  }
  @Test(dependsOnMethods = "D")
  public void f() 
  {
	  Reporter.log("I am F Method", true);
	  Reporter.log("I am Kere");
	  System.out.println("I am Print Stetment");
  }
}
 
