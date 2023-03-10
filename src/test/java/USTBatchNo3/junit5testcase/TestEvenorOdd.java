

package USTBatchNo3.junit5testcase;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;
/**
 * @author Administrator
 *
 */
public class TestEvenorOdd {
    
    
    //number is even
    @Test
    public void testEven() {
        
        int number=10;
        
        boolean result =iseven(number);
        assertTrue(result);
        
    }
    @Test
    public void testOdd() {
        
        int number=9;
        
        boolean result =iseven(number);
        assertFalse(result);
        
    }
      public boolean iseven( int number) {
          return number%2==0;
          
      }
}