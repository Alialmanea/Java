package oop;

import java.util.Scanner;

class Student{
String Name=null;
String Lastname=null;
int Id=0;
int Vize=0;
int Final=0;
double Hesaple(){

return (Vize*0.40)+(Final*0.60);
}

}

public class OOp {

    public static void main(String[] args) {
        int n=1000;
            
        Student[] ogernci=new Student[n];
         Scanner scanner = new Scanner(System.in);
         
        for(int i=0;i<n;i++){
        ogernci[i]=new Student();
        System.out.print(i+1+".name: ");
        ogernci[i].Name=scanner.nextLine();
        System.out.print(i+1+".Lastname: ");
        ogernci[i].Lastname=scanner.nextLine();
        System.out.print(i+1+".id: ");
        ogernci[i].Id=scanner.nextInt();
        ogernci[i].Vize=scanner.nextInt();
        ogernci[i].Final=scanner.nextInt();
        }
        
        
        
       
        
        
    }
    
}
