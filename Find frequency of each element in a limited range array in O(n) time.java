package freqof;

import java.util.HashMap;


public class Factorial {

    
    static HashMap <Character,Integer> map = new HashMap<Character, Integer>();
    
    private static void countfreq(char[]arr,int n){
        for(int i=0;i<n;i++){
            if(map.containsKey(arr[i]))
                map.put(arr[i],map.get(arr[i])+1);
            else
                map.put(arr[i],1);
             }   
    }
      static int freqof(char x){
        
        if(map.containsKey(x))
            return map.get(x);
        else
            return 0;
      }

    public static void main(String[] args) {
        String word="aalabalba";
        char[] a=new char[word.length()];
        a=word.toCharArray();
        countfreq(a,a.length);
        System.out.println("The freq of a is "+freqof('a'));
        
        
    }
    
}
