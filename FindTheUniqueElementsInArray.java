/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package find.the.unique.elements.in.array;

import java.util.ArrayList;

/**
 *
 * @author dabbaghie
 */
public class FindTheUniqueElementsInArray {
    static void printArray(int[]arr,int l){
        int j=0;
        for(int i=0;i<l;i++){
            if(i==0)
                System.out.print("["+arr[i]);
            else if(i==l-1)
                System.out.print(","+arr[i]+"]");
            else
                System.out.print(","+arr[i]);
            j++;
        }
        if(j==1) //jsut one Elemnet in
            System.out.print("]");
    }
    
    
    static int DistinctElementsOfIntegerArray(int[]arr,int length){
        int k=0;
        int l=length;
        for(int i=0;i<l;i++){
            int j;
            for(j=0;j<i;j++)
                if(arr[j]==arr[i])
                    break;
            if(i==j){
                arr[k]=arr[i];
                k++;
            }
        }
        return k;
    }
    
    
    static int FindTheUniqueElementsInArray(int[] arr,int l){
        int k=1;
        ArrayList<Integer> Unique=new ArrayList<Integer>();
        for(int i=0;i<l;i++){
            k=0;
            int j;
            for(j=0;j<l;j++){
                if(arr[i]==arr[j]){
                    k++;
                }
            }
            /*
             System.out.println("The Unique Element in Array");  //print the Unique in Different array or * arrayList
             System.out.print(Unique);*/
            
            if(k==1)
                Unique.add(arr[i]);
        }
        l=Unique.size();
        for(int i=0;i<l;i++)
            arr[i]=Unique.get(i);
        if(l!=0)
            return l;
        return -1;
    }
    
    
    
    
    public static void main(String[] args) {
        int []Array={1,3,3,4,55,55,55,0,8,10,10};
        int l=Array.length;
        
        printArray(Array,l);
        System.out.println("");
        System.out.println("========================");
        System.out.println("");
        
        //l=DistinctElementsOfIntegerArray(Array,l);
        
        //printArray(Array,l);
        System.out.println();
        
        l=FindTheUniqueElementsInArray(Array,l);
        if(l==-1)
            System.out.print("There isnot Unique Element in Array");
        
        printArray(Array,l);
        
        System.out.print("\n                Ali.Almanea</>");
        
        
    }
}

