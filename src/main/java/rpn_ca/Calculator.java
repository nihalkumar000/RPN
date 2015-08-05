package rpn_ca;

import java.util.Stack;
import java.util.StringTokenizer;

public class Calculator {
	
	public boolean isOperator(String str){
		if(str.equals("+") || str.equals("-") || str.equals("*") || str.equals("/") || str.equals("%") || 
				str.equals("^") )
			return true;
		return false;
	}
	
	public boolean isUnary(String operand)
	{
		if(operand.equals("%") || operand.equals("!"))
			 return true;
		return false;
	}
	
	public float factorial(float number){
		float result=number;
		if(number < 0)
			return Float.parseFloat("-999");
		else if(number == 0){
			return 1;
		} 
		else
			while(number!=1){
				number--;
				result=result*number;
			}
		return number;
	}
	
	
public float unaryOperation(float number, String operand){	 
	if(operand.equals("%"))
		return (number/100);
	return factorial(number);
	
}

public float binaryOperation(float one, float two, String operand){
	if(operand.equals("+"))
 		return(one+two);
	else if(operand.equals("-"))
		return (two-one);
	else if(operand.equals("*"))
		return (one*two);
	else if (operand.equals("/")){
		if( one == 0)
			return Float.parseFloat("-999");
		return (two/one);	
		}
	else if(operand.equals("^"))
		 return (float)(Math.pow(two,one));
	return Float.parseFloat("-999");
}

	
	public float operation(Stack<Float> stack, String operand)
	{
		float one,two;
		if (!stack.empty())
		{
			one=stack.pop();
			if(isUnary(operand)){
				return unaryOperation(one,operand);
			}
			if (!stack.empty()) {
				two=stack.pop();
			 return binaryOperation(one,two,operand); 
			}
			
		}
		 return Float.parseFloat("-999");
	}	
		// function ends 		
    		
    		
    		
	
	public  float eval (String str)
	{
		Stack<Float> stack = new Stack<Float>();
		StringTokenizer tok=new StringTokenizer(str," ");
		if(tok.countTokens()==0)
			return Float.parseFloat("-999");
	    while(tok.hasMoreElements()){	
	    	String ns=(String) tok.nextElement();
	    	if(!isOperator(ns)){
	    		try{
	    			 stack.push(Float.parseFloat(ns));	 
	    		}
	    		catch(Exception e){
	    			return Float.parseFloat("-999");
	    		}
	    	}	
	    	else
	    	   stack.push(operation(stack,ns));
	    }//while ends here
	    float result =stack.pop();
		if(stack.empty())
			return result;
		else 
			return Float.parseFloat("-999");
	}//function ends here.
	
}// class ends here.
