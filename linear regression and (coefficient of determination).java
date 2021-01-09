package ML;

import java.util.Random;

class Point {
	int x,y;
	Point(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	@Override
	public String toString() {
		return "("+this.x+", "+this.y+")";
	} 

}

class LinearRegression {
	private Point[] points;
	LinearRegression(Point[] points){
		this.points = points;
	}
	
	int meanX() {
		int sum  = 0;
		for(int i = 0; i < this.points.length; i++) {
			sum += points[i].x;
		}
		return (int) sum / this.points.length;
	}
	int meanY() {
		int sum  = 0;
		for(int i = 0; i < this.points.length; i++) {
			sum += points[i].y;
		}
		return (int) sum / this.points.length;
	}
	
	double slop() { // sum(xi * yi- n*x'*y') / 	sum(xi^2 - n *(x')^2)
		double num = 0 ,dom = 0;
		int n = this.points.length;
		for(int i = 0; i < n; i++) {
			num += (this.points[i].x * this.points[i].y);
			dom += Math.pow(this.points[i].x, 2);
		}
		num -= (n * this.meanX() * this.meanY());
		dom -= n * Math.pow(this.meanX(),2);
		return  num / dom;
	}
	
	double intercept() { // a = y' - slop *x'
		return this.meanY() - (this.slop() * this.meanX());
	}
	
	String RegressionEquation() {
		return "Y = "+this.slop()+"X"+"+"+this.intercept();
	}
	
	double prediction(int x) {
		return (this.slop() * x) + this.intercept(); 
	}
	
	int sumX () {
		int sum = 0;
		for(int i = 0; i < this.points.length;i++)
			sum += this.points[i].x;
		return sum;
	}
	
	int sumY () {
		int sum = 0;
		for(int i = 0; i < this.points.length;i++)
			sum += this.points[i].y;
		return sum;
	}
	
	/* correlation coefficient
		   N Σ xy – Σx Σy
		r = –––——————————————
		    [[N Σ x2 – (Σx)2] [N Σy2 – (Σy)2]]1/2
		*/
	double r() {
		int n = this.points.length;
		double num = 0,dom = 0,sumXY = 0, sumX_2 = 0, sumY_2 = 0;
		// sum(x*y)
		for(int i = 0; i < this.points.length;i++) {
			sumXY += this.points[i].x * this.points[i].y;
		}
		num = n *(sumXY) - this.sumX() * this.sumY(); // N Σ xy – Σx Σy
		for(int i = 0; i < this.points.length;i++) {
			sumX_2 += Math.pow(this.points[i].x, 2);
			sumY_2 += Math.pow(this.points[i].y, 2);
		}
		dom = Math.sqrt(((n * sumX_2) - Math.pow(this.sumX(), 2))* (n * sumY_2) - Math.pow(this.sumY(), 2));
		return Math.round(Math.pow(num / dom, 2) * 100);
	}
	double r2() {
		double RSS = 0,TSS = 0;
		// TRSS = sum(Yi -f(xi)) 
		for(int i = 0; i < this.points.length;i++) {
			TSS += Math.pow(this.points[i].y - this.meanY(),2); 
			RSS += 	Math.pow(this.points[i].y - this.prediction(this.points[i].x), 2);
		}
		return  Math.round(1-(RSS / TSS));
	}
	
}

public class Main {

	// generate Random limited number
		static int randInt(int min, int max){
			Random rnd = new Random();
	        return rnd.nextInt((max-min)+1)- min;
	    }
		
	public static void main(String[] args) {
		int n = 5;
		Point[] points = new Point[n];
		points[0] = new Point(100, 8);
		points[1] = new Point(150, 12);
		points[2] = new Point(200, 14);
		points[3] = new Point(250, 15);
		points[4] = new Point(300, 16);
		
		LinearRegression lr = new LinearRegression(points);
		System.out.println("Mean of x (X') = "+ lr.meanX());
		System.out.println("Mean of y (Y') = "+ lr.meanY());
		System.out.println("Slop(m) = "+ lr.slop());
		System.out.println("Intercept(b) = "+ lr.intercept());
		System.out.println("RegressionEquation : "+ lr.RegressionEquation());
		System.out.println("prediction(180) = "+ lr.prediction(180));
		System.out.println("The Coefficient of Determination (R Squared) = "+ lr.r()+"%");
		System.out.println("The Coefficient of Determination (R2 Squared) = "+ lr.r2());
		
	}

}
