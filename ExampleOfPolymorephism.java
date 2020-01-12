/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication13;



import java.lang.reflect.Constructor;

interface face{
    void a();
    default void b(){ System.out.println("in A");
    }
}

class A implements face{
@Override
public void a(){
System.out.println("in A");
}
}

class B implements face{
@Override
public void a(){
System.out.println("in B");
 }
}


class Call{
    String name="Call";
    void invoked(face f){
    if(f instanceof A){
    A a=(A)f;
    System.out.println("Downcasting is preformed in A");
    }
    
    if(f instanceof B){
    B a=(B)f;
    System.out.println("Downcasting is preformed in B");
    }
        
    
  
  }
 }






public class firts{
     int x=1;
      public int getx(){
        return x;
    }
    }

 class second extends firts {
    second(){
    x=2;
    }
     
    }

class Third extends second {
    Third(){
    x=3;
    }
     
    }

 

    
 class JavaApplication13 {

    
    
    public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException, NoSuchMethodException {
        
       // firts[] first ={new firts(),new second(),new Third() } ;
            
        firts f =new firts();
        firts s =new second();
        firts t =new Third();
        
        if(s instanceof second ){
        second d=(second)s;//dowmCasting 
        System.out.println("Downcating  is performed");
        }
        
        System.out.println("X = "+f.getx());
        System.out.println("X = "+s.getx());
        System.out.println("X = "+t.getx());
        
        System.out.println("");
        
         System.out.println("X = "+new firts().getx());
        System.out.println("X = "+new second().getx());
        System.out.println("X = "+new Third().getx());
        
        
        Call c=new Call();
        face inf=new B();
        c.invoked(inf);
       
        
       
    
}
 }
