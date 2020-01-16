package Frequency;

import java.util.HashMap;

class Frequency{

private static HashMap <Character,Integer> map = new HashMap<Character, Integer>();
  private char[] a;  
Frequency(String str,int n){
    a=new char[n];
a=str.toCharArray();
}
Frequency(String str){
    a=new char[str.length()];
a=str.toCharArray();
}
      void countfreq(){
        for(int i=0;i<a.length;i++){
            if(map.containsKey(a[i]))
                map.put(a[i],map.get(a[i])+1);
            else
                map.put(a[i],1);
             }   
    }
       int freqof(char x){
        
        if(map.containsKey(x))
            return map.get(x);
        else
            return 0;
      }
       void print (){
      for(Character key : map.keySet()){
      System.out.println("The element of "+key+" is : "+map.get(key));
      }
      
      } 

}


public class Homework {

  
    public static void main(String[] args) {
        String word="aalabalba";
        Frequency frq=new Frequency(word);
        frq.countfreq();
        System.out.println("The Frequency of Element a is: "+frq.freqof('a'));
        frq.print();
        
    }
    
}
