/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication5;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author destek
 */
public class JavaApplication5 {

    public static void printMatrix(int[][]a){
     for (int i = 0; i < a.length; i++) {         //this equals to the row in our matrix.
         for (int j = 0; j < a[i].length; j++) {   //this equals to the column in each row.
            System.out.print(a[i][j] + " ");
         }
         System.out.println(); //change line on console as row comes to end in the matrix.
      }
    }
    
     public static int [][] create_intMatrix (int row,int colum,int from,int to){
     int[][] Matrix = new int[row][colum];
     Random rnd=new Random();
      for (int i = 0; i < Matrix.length; i++) {         //this equals to the row in our matrix.
         for (int j = 0; j < Matrix[i].length; j++) {   //this equals to the column in each row.
            Matrix[i][j]=ThreadLocalRandom.current().nextInt(from,to);
         }
      }
     
    
        
      return Matrix;
     }
    
  
    public static void main(String[] args) {
        // TODO code application logic here
        
        int[][] current_matrix=create_intMatrix(12,10,0,8);
        printMatrix(current_matrix);
       
    }
    
}
