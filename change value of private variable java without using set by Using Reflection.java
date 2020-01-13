package javaapplication22;

import java.lang.reflect.Field;
import java.util.logging.Level;
import java.util.logging.Logger;

class A {

    private int sayi;
    private int sayilar[];
    private String isimler;

    private int[] scores;

//    public void setScores(int[] scr) {
//        // this.scores = scr; hata olur 
//        this.scores = new int[scr.length];
//        System.arraycopy(scr, 0, this.scores, 0, scr.length);
//    }


    public int[] getScore() {
        int[] copy = new int[this.scores.length];
        System.arraycopy(this.scores, 0, copy, 0, copy.length);
        return copy;
        // return this.scores; hata olur
    }

    public int getSayi() {
        return sayi;
    }

    public int[] getSayilar() {
        return sayilar;
    }

    public String getIsimler() {
        return isimler;
    }
}




public class JavaApplication22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InstantiationException, IllegalAccessException, SecurityException, NoSuchFieldException {
        try {
        
            Class cls = A.class;
            
           Field field = cls.getDeclaredField("sayi"); 
           //field=cls.getDeclaredField("sayi");
           field.setAccessible(true);
           A a=(A)cls.newInstance();
            Object obj=field.get(a);
           field.set(a,20);
           
           
           
           
           System.out.println("Field Name = " + field.getName());
            System.out.println("Field Type = " + field.getType());
            System.out.println("A = " + a.getSayi());
           
            
        } catch (Exception ex) {
            Logger.getLogger(JavaApplication22.class.getName()).log(Level.SEVERE, null, ex);
        
    }
    }
    
}
