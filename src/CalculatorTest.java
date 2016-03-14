import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * 
 * @author Bhavin
 * @since 14/03/2016; 10:46
 */

public class CalculatorTest {
	@Test
	public void evaluateExpression(){
		Calculator calculator = new Calculator();
		int sum = calculator.evaluate("1+2+3");
		assertEquals(6,sum);
	}

}
