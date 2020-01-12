package oop;

class person implements Cloneable{
int id;
String name ;
String lastname;
Address address;

person(int id,String name ,String lastname,Address address){
this.id=id;
this.name=name;
this.lastname=lastname;
this.address=address;

}
void display(){

System.out.println("id :"+id+" :name :"+name+" :Lastname :"+lastname+" :Address :"+address.city+":"+address.countery+":"+address.street_no);
}

protected Object clone() throws CloneNotSupportedException{
    person p=(person) super.clone();
    p.setAddress((Address)address.clone());
    return p;
}
void setname(String name){
    this.name=name;
}

Address getaddress(){
return this.address;
}
void setAddress(Address address){
this.address=address;
}


}
class Address implements Cloneable{
String city;
String countery;
int street_no;
Address(String city,String countery,int street_no){
this.city=city;
this.countery=countery;
this.street_no=street_no;
}

protected Object clone() throws CloneNotSupportedException{
    
    return super.clone();
}


void setcity(String city){
    this.city=city;
}

void setcountery(String countery){
    this.countery=countery;
}

}


public class Sistem {

    public static void main(String[] args) throws CloneNotSupportedException {
        Address address_p1=new Address("ibb","yemen",105103);
        person p1=new person(170304,"Ali","almanea",address_p1);
        
        
        person p1_copy=(person)p1.clone();
        p1_copy.setname("Ahmet");
        p1_copy.getaddress().setcity("sanaa");
        p1_copy.getaddress().setcountery("syrian");
        
        p1.display();
        p1_copy.display();
        
        System.out.println(p1==p1_copy);
        System.out.println(p1.equals(p1_copy));
         System.out.println(p1.getClass()==p1_copy.getClass());
        
        //output
        
//        id :170304 :name :Ali :Lastname :almanea :Address :sanaa:yemen:105103
//        id :170304 :name :Ahmet :Lastname :almanea :Address :syrian:yemen:105103
//        oop.person@5f184fc6
//        oop.person@3feba861

    }
   
}
