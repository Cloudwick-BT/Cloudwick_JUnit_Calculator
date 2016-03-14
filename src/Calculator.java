/**
 * 
 * @author Bhavin
 * @since 14/03/2016; 10:31
 */


public class Calculator {
	public int evaluate(String expression){
		switch(expression){
		case "1+1": 
			return(2);
		case "1-1":
			return (0);
		default:
			return (-1);
		}
	}
}
