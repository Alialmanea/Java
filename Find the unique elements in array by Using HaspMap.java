/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package opp;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author dabbaghie
 */

public class Opp {
    
    static HashMap <Integer, Integer> map = new HashMap<Integer, Integer>();
    
    static void countfreq(int[]arr,int n){
        for(int i=0;i<n;i++){
            if(map.containsKey(arr[i]))
                map.put(arr[i],map.get(arr[i])+1);
            else
                map.put(arr[i],1);
            
        }
    }
    
    static int freqof(int x){
        
        if(map.containsKey(x))
            return map.get(x);
        else
            return 0;
        
        
    }
    
    ArrayList Unique_Elements(int arr[],int n ){
        countfreq(arr,arr.length);
        ArrayList<Integer> Unique_elements=new ArrayList<Integer>();
        for(int i=0; i<n ;i++){
            if (map.get(arr[i])== 1)
                Unique_elements.add(arr[i]);
        }
        
        return Unique_elements;
    }
    
    
    
    public static void main(String[] args) {
        
        int arr[]={1,2,3,4,2,3,3,0,2,3,45,5,42};
        ArrayList<Integer> Unique_elements=new Opp().Unique_Elements(arr,arr.length);
        
        countfreq(arr,arr.length);
        
        for(int i=0;i<arr.length;i++){
            System.out.println("The Frequency of "+arr[i]+" Element is :"+freqof(arr[i]));
        }
        System.out.println("");
        
        System.out.println("The Unique Element in Array is  :");
        
        for (int numbers :Unique_elements)
            System.out.print(numbers+" ");
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
