package testNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AssertEqualNotEqualsStudy {
  @Test
  public void MyMethod1() 
  {
	  Reporter.log("Hi I am Satish",true);
	  Reporter.log("I Iam Reporter without boolean");
	  System.out.println("I Am Printing Statement");
	  
  }
  @Test
  public void MyStudy() 
  {
	  String S = "Satish";
	  String S1 = "Satish";
	  String S3 = "Deshmukh";
	  
	  Assert.assertEquals(S, S1,"S is Not Equals S1 then test case is fail");
	  Assert.assertNotEquals(S, S3,"S And S3are Equal then TC is faile");
	  //Assert.assertEquals(S1, S3,"S1 is not equals s3 then TC is Fail");
	  
	  
  }
}
