/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package the.frequency.of.litter;

import java.util.Scanner;

/**
 *
 * @author dabbaghie
 */
public class TheFrequencyOfLitter {

    public static void frequency_litter(String sentence){
    char litter[]=new char[sentence.length()];  //The Array of litter ===> litter of sentence
    litter=sentence.toCharArray();         //To Enter the litter in array
    int frequency_litter[]=new int[litter.length];
    for(int i=0;i<frequency_litter.length;i++) //To Empty The Array
    frequency_litter[i]=-1;
    int frequencyoflitter;  //*the frequency
    for(int i=0;i<litter.length;i++){
        frequencyoflitter=1;
    for(int j=i+1;j<litter.length;j++){
    if(litter[i]==litter[j]){
    frequencyoflitter++;
    frequency_litter[j]=0;
    }}
    if(frequency_litter[i]!=0)
            frequency_litter[i] = frequencyoflitter;
    }

    System.out.println("The frequency of all litter \n  ===========================");

    for(int f=0; f<frequency_litter.length; f++)
    {
        if(frequency_litter[f]!=0)
        {
            System.out.println("The frequency of "+litter[f]+" litter is :"+(frequency_litter[f]*100)/frequency_litter.length+"%");

        }
    }
    System.out.println("");
    System.out.println("                                      Ali Almanea</>");
    }

    public static void main(String[] args) {
        // TODO code application logic here

        String  sentence = null;
         Scanner myObj = new Scanner(System.in);
         System.out.print("Enter it here : ");

     sentence = myObj.nextLine();

       frequency_litter(sentence);
    }

}
