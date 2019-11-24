/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frequency.test.pkgfor.random.numbers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import static java.util.Collections.list;
import java.util.Map;
import java.util.Random;
import java.util.stream.Collectors;

/**
 *
 * @author destek
 */  

public class FrequencyTestForRandomNumbers {
/*If you would to use Arraylist;
 ^^
 ^^*///Use this mathodes to Show the frequency of each numbers;
   /* public static ArrayList<Integer> myNumbers(int z) {

    ArrayList<Integer> digits = new ArrayList<Integer>();
    String number = String.valueOf(z);
    for (int a = 0; a < number.length(); a++) {
        int j = Character.digit(number.charAt(a), 10);
        digits.add(j);
    }
    return digits;

}*/
    
    
    
    public static void main(String[] args) {
        int times=100;
        int frequency=0;
        //ArrayList<Integer> frequent_numbers=new ArrayList<Integer>();
        int[] Random_numbers=new int[times];
        int[] frequent_numbers=new int[times];
        Random rnd=new Random();
        
        for(int i=0;i<times;i++){  //create Random numbers 
        Random_numbers[i]=rnd.nextInt(7); 
        }
        
        System.out.println();
        /*for(int i=0;i<times;i++){
            for(int j=i+1;j<times;j++){
            if(Random_numbers[i]==Random_numbers[j])
                frequent_numbers.add(Random_numbers[j]);
            }
        }*/
        Arrays.sort(Random_numbers);
        System.out.print("[");
        for(int i=0;i<times;i++){     //Showing the array after be sortd it ;
        if(i==times-1)
            System.out.print(Random_numbers[i]+"]");
        else
            System.out.print(Random_numbers[i]+",");
        
         frequent_numbers[i] = -1;      //TO Make The frequent_numbers Empty;
        }
        
        
          for(int i=0; i<times; i++)
        {
        frequency = 1;
        for(int j=i+1; j<times; j++)
        {
            if(Random_numbers[i]==Random_numbers[j])
            {
                frequency++;
                frequent_numbers[j] = 0;
            }
        }

        if(frequent_numbers[i]!=0)
        {
            frequent_numbers[i] = frequency;
        }
    }
    System.out.println("The frequency of all elements of array :");
    for(int i=0; i<times; i++)
    {
        if(frequent_numbers[i]!=0)
        {
            System.out.println("The frequency of Number: "+ Random_numbers[i]+" is "+frequent_numbers[i]+" times");
        }
    }
}
        
}
      
        
        
        
        
        
 
    
