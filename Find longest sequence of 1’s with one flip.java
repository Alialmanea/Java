package Findlongestsequenceof1swithoneflip;

import java.util.LinkedList;
import java.util.List;

public class Findlongestsequenceof1swithoneflip {

	public static void main(String[] args) {
		int[] arr= new int[] {1,1,0,1,1,1,1,0,1,1,0,1,1};
		int l=arr.length;
		List<Integer>countofone=new LinkedList<Integer>();
		
		int n=0;
		for (int i=0;i<l;i++) {
				if(arr[i]==1)
					n++;
			    if(n>0 && arr[i]!=1) {
					countofone.add(n);
					n=0;
					countofone.add(n);
					}
				 if(n>0 && i==l-1)
					countofone.add(n);
		}
		int sum=0;
		int max=0;
		boolean is1st=true;
		for(int i=0;i<countofone.size();i+=2){
			sum+=countofone.get(i);
			
			if(i%2==0) {
				if (is1st==true) {
				max=sum;
				is1st=false;
				}
				if(max<sum)
					max=sum;

				sum=countofone.get(i);
			}
				
		}
		
		
		System.out.println(countofone); //convert the array of 1,0 to (sequence of 1’s with one flip) like this
		System.out.println(max); //Find longest sequence of 1’s with one flip
		
		
	}

}
