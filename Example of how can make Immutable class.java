/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mutable;

class Born{
int day;
int month;
int year;

Born(){
this.day=day;
this.month=month;
this.year=year;
}
void setday(int day){
    this.day=day;
}

void setmonth(int month){
    this.month=month;
}

void setyear(int year){
    this.year=year;
}

int  getday(){
return this.day;
}


int  getmonth(){
return this.month;
}


int  getyear(){
return this.year;
}

    @Override
    public String toString() {
      return "hello"; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int hashCode() {
        return super.hashCode(); //To change body of generated methods, choose Tools | Templates.
    }


}


final class immutable implements Cloneable {
private final String name;
private final  int id;
private final  Born born;


immutable(String name,int id,Born born){
this.name=name;
this.id=id;
Born cloneborn=new Born();
cloneborn.setday(born.getday());
cloneborn.setmonth(born.getmonth());
cloneborn.setyear(born.getyear());
this.born=cloneborn;
}

String getname(){
return this.name;
}

int getid(){
return this.id;
}

Born getborn(){
    Born copy=new Born();
    copy.setday(this.born.getday());
    copy.setmonth(this.born.getmonth());
    copy.setyear(this.born.getyear());
return copy;
}

 }



public class IMMutable {

    
    public static void main(String[] args) {
        Born born=new Born();
        born.setday(26);
        born.setmonth(8);
        born.setyear(1995);
        
        immutable im;
        im=new immutable("Ali",170304,born);
       
       
        
        
        System.out.println("Name: "+im.getname()+" Id: "+im.getid()+" Day: "+  im.getborn().getyear());
       
       im.getborn().setyear(1994);
        System.out.println("Name: "+im.getname()+" Id: "+im.getid()+" Day: "+  im.getborn().getyear());
        
    }
    
}
