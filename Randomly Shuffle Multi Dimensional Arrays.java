/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication122;

import java.util.Random;

/**
 *
 * @author dabbaghie
 */
public class Matrix {
    
    
    
    
    static int [][] Creat_Matrix(int row ,int colum){
        int [][] new_Matrix=new int[row][colum];
        return new_Matrix;
    }
    
    static void Fill_Matrix_withRandomNumbers(int[][] Matrix,int row ,int colum,int from,int to){
        
        for(int i=0;i<row;i++){
            for(int j=0;j<colum;j++){
                Matrix[i][j]=Random_NextInt(from,to);
            }
        }
    }
    
    static  void Fill_Matrix_withRandomNumbers(int[][] Matrix,int from,int to){
        Random rnd =new Random();
        for(int i=0;i<Matrix.length;i++){
            for(int j=0;j<Matrix[i].length;j++){
                Matrix[i][j]=rnd.nextInt((to-from)+1)+from;
            }
        }
    }
    
    static void print_Matrix(int[][] Matrix,int row,int colum){
        for(int i=0;i<row;i++){
            for(int j=0;j<colum;j++){
                System.out.print(Matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    
    static void print_Matrix(int[][] Matrix){
        for(int i=0;i<Matrix.length;i++){
            for(int j=0;j<Matrix[i].length;j++){
                System.out.print(Matrix[i][j]+" ");
            }
            System.out.println();
        }
        
    }
    
    
    static int Random_NextInt(int min,int max){
        Random rnd=new Random();
        return rnd.nextInt((max-min)+1)-min;
    }
    
    static void Shuffle_Matrix(int [][] Matrix){
        
        for(int i=Matrix.length-1;i>=0;i--){
            for(int j=Matrix[i].length-1;j>=0;j--){
                int indexofrow=Random_NextInt(0,i);
                int indexofcolum=Random_NextInt(0,j);
                int temp=Matrix[i][j];
                Matrix[i][j]=Matrix[indexofrow][indexofcolum];
                Matrix[indexofrow][indexofcolum]=temp;
            }
        }
    }
    
    public static void main(String[] args) {
        int Row=2,Colum=3;
        int[][] Matrix=Creat_Matrix(Row,Colum);
        
        
        Fill_Matrix_withRandomNumbers(Matrix,1,9);
        System.out.println("Befor Shuffle Matrix  ");
        print_Matrix(Matrix,Row,Colum);
        System.out.println("After Shuffle Matrix  ");
        Shuffle_Matrix(Matrix);
        print_Matrix(Matrix);
        
        
        
    }
    
}

