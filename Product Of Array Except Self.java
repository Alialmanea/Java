package solution;

public class Solution {
	
	static void printArray(int[]array) {
		for(int i=0;i<array.length;i++) {
			if(i==0)
			 System.out.print("["+array[i]);
			else
			 System.out.print(","+array[i]);	
		}
			 System.out.println("]");
			
		
	}
	
	static int[]productExceptslef(int[] nums){
		int [] output=new int[nums.length];
		
		for(int i=0;i<nums.length;i++) {
			int product=1;
			for(int j=0;j<nums.length;j++) {
				if(j!=i)
				product*=nums[j];
			}
			output[i]=product;
		}
		
		
		return output;
	}
	
	public static void main(String[] args) {
		int[] nums=new int[] {1,2,3,4};
		int []output =new int[nums.length];
		output=productExceptslef(nums);
		
		printArray(nums);
		printArray(output);	
		
	}

}
