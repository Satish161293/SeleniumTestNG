package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertTruAndFalseStudy {
  
	  @Test
	  public void MyStudy() 
	  {
		  boolean S = true;
		  boolean S1 = false;
		  
		  
		  Assert.assertTrue(S,"S is Not Equals S1 then test case is fail");
		  Assert.assertFalse(S1,"S And S3are Equal then TC is faile");
//		 Assert.fail();
//		 Assert.assertTrue(S,"S is Not Equals S1 then test case is fail");
		 
		  
		  
	  }
  }

