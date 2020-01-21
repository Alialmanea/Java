package Findlongestsequenceof1swithoneflip;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;




public class Parentheses_Expression {


static boolean ParenthesesExpressionsIsEqual(String Parentheses ){
	
	Stack<Character>st1=new Stack<Character>();
	Stack<Character>st2=new Stack<Character>();
	
	for(int i=0;i<Parentheses.length();i++) {
		if(Parentheses.charAt(i)=='(')
		st1.push(Parentheses.charAt(i));
		else
		st2.push(Parentheses.charAt(i));
	}
	
	if(st1.size()!=st2.size())
		return false;
	
	
	

	return true;
}
	
	
	public static void main(String[] args) {
		String  Parentheses="(((((((())))))))";
		boolean isequal=ParenthesesExpressionsIsEqual(Parentheses);
		
		
		if(isequal!=false)
	System.out.println("Parentheses_Expressions is equal");
		else
	System.out.println("Parentheses_Expressions is not equal");
				
		

    }
}
