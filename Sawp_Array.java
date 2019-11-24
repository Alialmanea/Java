/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

/**
 *
 * @author destek
 */
public class JavaApplication4 {
    
    public static void swap(int[]b1,int[]b2){
        if(b1.length!=b2.length)
            System.out.println("The Lenght of Arrays is not Same !!");
        else{
            int temp_array[]=new int[b1.length];
            for(int i = 0;i<b2.length;i++){
                temp_array[i]=b2[i];
                b2[i]=b1[i];
                b1[i]=temp_array[i];
            }
        }
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] a1={1,3,5,7,9};
        int[] a2={2,4,6,8,10};
        System.out.println();
        for(int i = 0;i<5;i++)
            System.out.print(a1[i]+" ");
        
        
        System.out.print("\n");
        for(int i = 0;i<5;i++)
            System.out.print(a2[i]+" ");
        
        System.out.print("\n");
        System.out.print("After Calling The Swap mathod\n");
        swap(a1,a2);
        for(int i = 0;i<5;i++)
            System.out.print(a1[i]+" ");
        
        System.out.print("\n");
        for(int i = 0;i<5;i++)
            System.out.print(a2[i]+" ");
        
        
    }
    
}

