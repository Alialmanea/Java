package Findlongestsequenceof1swithoneflip;

import java.util.LinkedList;
import java.util.List;

public class Findlongestsequenceof1swithoneflip {

	public static void main(String[] args) {
		char[] arr= new char[] {'a','a','a','a','b','c','d','f','b','b','b','b','b','f','f','f','f','f','f','f','a'};
		int l=arr.length;
		
		int index=1;
		int i=0;
		int f=1;
		int max=0;
		boolean is1st=true;
		
		while(index<l) {
			if(arr[i]==arr[index])
				f=f+1;
			else{
				i=index;
				if(is1st==true) {
					is1st=false;
					max=f;
				}
				if(max<f)
					max=f;
			
				f=1;
			}
			
			index++;
		}
		
		System.out.println(max);
    }
}
