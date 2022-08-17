package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertNullNotNullStudy {
 
	  @Test
	  public void MyStudy1() 
	  {
		  String S = null;
		  String S1 = "Satish";
		  
		  
		  Assert.assertNull(S,"S1 is not Null TC is fail");
		  Assert.assertNotNull(S1,"IS Null  Tc is fail" );
		 
		  
		  
	  
	  
	  
  }
}
