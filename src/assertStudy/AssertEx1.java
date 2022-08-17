package assertStudy;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertEx1 {
  @Test
  public void A()
  {
	  String S ="Satish";
	  String S4 = "Satish";
	  String S1 = "satish";
//	 boolean B = true;
//	 boolean B1 =false;
//	 String S3= null;
	 SoftAssert Soft = new SoftAssert();
	 Soft.assertEquals(S, S4,"S And S4 is not matching then TC is Failed");
	 Soft.assertNotEquals(S, S1,"S And S1 is not matching then TC is Failed");
	 Soft.assertAll();
  }
}
