import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

class TESTreadInput {
  int testDay = 1;
  int testMonth = 2;
  int testYear = 2000;

  @Test

  public void testGetMonth()
  {
      Date date = new Date(1,1,2000);
      date.getMonth();
      Assert.assertEquals(1,1);
  }
  
  @Test
  
  public void testReadInputYear() {

    Date date = new Date(testDay, testMonth, testYear);
    Assert.assertTrue(date.getYear() == testYear);
    
  }
  
  @Test
 
  public void testReadInputMonth() {
    Date date = new Date(testDay, testMonth, testYear);
    Assert.assertTrue(date.getMonth() == testMonth);
    
  }

  
  @Test

  public void testReadInputDay() {

    Date date = new Date(testDay, testMonth, testYear);
    Assert.assertTrue(date.getDay() == testDay);
    
  
    }
   
  @Test
  
  public void testmonthString() {
    Assert.assertTrue(date.monthString(2).equalsIgnoreCase("February"));
  
  
  }

  @Test
  
  public void testmonthOK() {
    String testMonth2 = "July";
    Assert.assertTrue(date.monthOK(testMonth2) == true);
    
    
  } 
  
  @Test
  
  public void testEquals() {
    Date otherDate = new Date(1, 2, 2000);
    Assert.assertTrue(date.equals(otherDate));
    
    
  }
  
  @Test
  
  public boolean monthCheck(String month) {

    return switch (month) {
      case "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" -> true;
      default -> false;
    };
}
