/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package find.the.unique.elements.in.array;

/**
 *
 * @author dabbaghie
 */
public class DistinctElementsOfIntegerArray {
    
    
    static void printArray(int[]arr,int l){
    for(int i=0;i<l;i++){
        if(i==0)
            System.out.print("["+arr[i]);
        else if(i==l-1)
             System.out.print(","+arr[i]+"]");
        else
             System.out.print(","+arr[i]);
        }
    
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

        
        
        
    public static void main(String[] args) {
        int []Array={1,3,3,4,55,55,55,0,8,10,10,3,1};
        int l=Array.length;
        
        printArray(Array,l);
         System.out.println("");
        
         System.out.println("========================");
         
         
         System.out.println("");
         
         l=DistinctElementsOfIntegerArray(Array,l);
         
         printArray(Array,l);
        
         
    }
}
