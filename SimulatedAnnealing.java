package SimulatedAnnealing;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;



class City{
	private int x;
	private int y;
	
	// Constructs a city at chosen x, y location
	City(int x,int y){
		this.x=x;
		this.y=y;
		}
	
	// Constructs a randomly placed city
	City(){
		this.x =(int)Math.random()*200;
		this.y =(int)Math.random()*200;
		}
	
	 int getX() {
		return this.x;
		}
	 
	 int getY() {
		return this.y;
		}
	 
	 // Gets the distance to given city
	    public double distanceTo(City city){
	        int xDistance = Math.abs(getX() - city.getX());
	        int yDistance = Math.abs(getY() - city.getY());
	        double distance = Math.sqrt( (xDistance*xDistance) + (yDistance*yDistance) );
	        
	        return distance;
	    }
	 
	 @Override
	    public String toString(){
	        return "("+getX()+", "+getY()+")";
	    }
	 
}

class Tour {
	private List<City> cities;
	private int distance;

    Tour(List<City> cities) {
    	this.cities = new ArrayList<City>(cities);
    	// Randomly reorder the tour
    	Collections.shuffle(this.cities);
    }
     City getCity(int index) {
        return cities.get(index);
    }
     
     void setCity(int tourPosition,City city) {
    	 cities.set(tourPosition, city);
    	// If the tours been altered we need to reset the fitness and distance
    	 this.distance=0;
     }
     
     List<City> getCities() {
         return this.cities;
     }
  
     // Gets the tour length of given city
     int getTourLength() {
    	if (distance != 0)
    		return distance;

        int totalDistance = 0;

        for (int i = 0; i < noCities(); i++) {
            City start = getCity(i);
            City end = getCity(i + 1 < noCities() ? i + 1 : 0);
            totalDistance += Util.distance(start, end);
        }

        distance = totalDistance;
        
        return totalDistance;
    }
    
    Tour duplicate() {
        return new Tour(new ArrayList<>(cities));
    }
     
     int noCities() {
        return cities.size();
    }
     
    void printCities() {
    	System.out.print("[");
    	for(int i=0;i<cities.size();i++)
    	System.out.print(cities.get(i).toString());
    	
    	System.out.println("]");
    }
    
    void swapCities(int noCity1, int noCity2) {
   
    	if(this.cities.size()<=noCity1 || this.cities.size()<=noCity2)
    		System.out.println("The number of city you have Entered is not available !");
    	else
    		Collections.swap(this.cities, noCity1, noCity2);
    	
    }
    
    @Override
    public String toString(){
        return this.cities.toString();
    }
}

class Util {
     static double probability(double f1, double f2, double temp) {
        if (f2 < f1)
        	return 1;
        return Math.exp((f1 - f2) / temp);
    }
     
   //Euclidean distance between the two given cities.
     
    public static double distance(City city1, City city2) {   
        int xDist = Math.abs(city1.getX() - city2.getX());
        int yDist = Math.abs(city1.getY() - city2.getY());
        return Math.sqrt(xDist * xDist + yDist * yDist);
    }
}


public class SimulatedAnnealing {
	
	 private static double temperature = 1000;
	 private static double coolingFactor = 0.995;

	public static void main(String[] args) {
		
		List<City>cities=new ArrayList<>();
		
		City Ankara =new City(100,100);
		City Izmir =new City(200,200);
		City Istanbul =new City(100,200);
		City siirt =new City(200,100);
		City Batman =new City(300,100);
		
		cities.add(Ankara);
		cities.add(Izmir);
		cities.add(Istanbul);
		cities.add(siirt);
		cities.add(Batman);
	
		Tour currentTour =new Tour(cities); 
		
		 System.out.println("Final tour length: " + currentTour.getTourLength());
	     System.out.println("bestTour : " + currentTour);
		
		
		Tour bestTour =currentTour.duplicate();
		
		for (double t = temperature; t > 1; t *= coolingFactor) {
			// Create new neighbour tour
            Tour neighbor = currentTour.duplicate();
         
            // Get the cities at selected positions in the tour
            int index1 = (int) (neighbor.noCities() * Math.random());
            int index2 = (int) (neighbor.noCities() * Math.random());
          
            neighbor.swapCities(index1, index2);

            int currentLength = currentTour.getTourLength();
            int neighborLength = neighbor.getTourLength();
            
            // Decide if we should accept the neighbour
            if (Math.random() < Util.probability(currentLength, neighborLength, t)) {
            	currentTour = neighbor.duplicate();
            }
            
            // Keep track of the best solution found
            if (currentTour.getTourLength() < bestTour.getTourLength()) {
            	bestTour = currentTour.duplicate();
            }
        }

        System.out.println("Final tour length: " + bestTour.getTourLength());
        System.out.println("bestTour : " + bestTour);
        
		}
		
}
