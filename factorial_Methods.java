/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

/**
 *
 * @author destek
 */
public class JavaApplication2 {
    
    public static long factorial(int n){
    
      long fok=1;
        if(n==0)
        return 1;
        
        else{
        for(int i=1;i<=n;i++){
        fok=fok*i;
        }
        }
   return fok;
    }
    
    public static long recursiveMethods_Of_factorial(int n){
  if(n==0)
    return 1;
  return n*factorial((n-1));
    
    }
    
    
    public static void main(String[] args) {
        
      /*for(byte i=0;i<=10;i++)
            long a=factorial(i);
       System.out.println(i+"\t"+a);
        */
        byte x=6;
        long a=recursiveMethods_Of_factorial(x);
         System.out.print(x+": "+a);
        
        
        // TODO code application logic here
    }
    
}
