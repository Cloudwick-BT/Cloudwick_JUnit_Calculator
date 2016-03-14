/**
 * 
 * @author Bhavin
 * @since 14/03/2016; 10:31
 */


public class Calculator {
	public int evaluate(String expression){
		int sum = 0;
		for(String summand : expression.split("\\+")){
			sum += Integer.valueOf(summand);
		}
		return sum;
	}
}
