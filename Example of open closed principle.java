interface IOperation{
	double resulet();
}

interface ICalculator {
    void printcalculate(IOperation operation);
}

class Addition implements IOperation 
{
    private double firstOperand;
    private double secondOperand;
    private double result = 0.0;
     
    public Addition(double firstOperand, double secondOperand) {
        this.firstOperand = firstOperand;
        this.secondOperand = secondOperand;
    }
    
    double getfirstOperand() {
    	return this.firstOperand;
    }
    
    double getsecondOperand() {
    	return this.secondOperand;
    }
    
    
 
    double getresult() {
    	return this.result;
    }

	@Override
	public double resulet() {
		return this.firstOperand+this.secondOperand;
	}
 
    
}

class Substraction implements IOperation 
{
    private double firstOperand;
    private double secondOperand;
    private double result = 0.0;
     
    public Substraction(double firstOperand, double secondOperand) {
        this.firstOperand = firstOperand;
        this.secondOperand = secondOperand;
    }
 
    double getfirstOperand() {
    	return this.firstOperand;
    }
    
    double getsecondOperand() {
    	return this.secondOperand;
    }
    
    
 

	@Override
	public double resulet() {
		return this.firstOperand-this.secondOperand;
	}
    
}

class SimpleCalculator implements ICalculator{

	@Override
	public void printcalculate(IOperation operation) {
		if (operation ==null) {
			System.out.println("There is not operation");
		}
		else {
			if(operation instanceof Addition ) {
				Addition obj =(Addition) operation;
				System.out.println("The resulet of Addition operation is : "+obj.resulet());
			}
			if(operation instanceof Substraction ) {
				Substraction obj =(Substraction) operation;
				System.out.println("The resulet of Substraction operation is : "+obj.resulet());
			}
					
		}	
	}	
}




public class Main {

	public static void main(String[] args) {
		Addition addition=new Addition(1,2);
		Substraction substraction=new Substraction(1,2);
		
		SimpleCalculator simpleCalculator =new SimpleCalculator();
		simpleCalculator.printcalculate(addition);
		simpleCalculator.printcalculate(substraction);
		

	}

}
