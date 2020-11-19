
import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
class StringCalculaterTest {
	StringCalulater sc=new StringCalulater();

	@Test
	public void StringIsEmpty() throws Exception {
	   assertEquals(sc.Add(""), 0);
		
	}
	
    @Test
    public void StringReturnItself() throws Exception {
 	   assertEquals(sc.Add("1"), 1);
 		
 	}
    @Test
    public void StringReturnSumSepratedBComma() throws Exception {
 	   assertEquals(sc.Add("1,2"), 3);
 		
 	}
    
    @Test
    public void StringReturnSumOfUnknownAmountOfNumbers() throws Exception {
 	   assertEquals(sc.Add("1,2,3"), 6);
 		
 	}
    
    @Test
    public void StringReturnSumSeperatedBNewLine() throws Exception {
 	   assertEquals(sc.Add("1\n2,3"), 6);
 		
 	}
    
    @Test(expected = Exception.class )
    public void NegativeInputThrowsException() throws Exception {
 	       sc.Add("-1");
 		
 	}
    
    @Test
    public void ignoresnumbergreaterthan1000() throws Exception {
 	   assertEquals(sc.Add("10,10,1001"), 20);
 		
 	}
   
}
