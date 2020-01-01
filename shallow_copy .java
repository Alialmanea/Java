package clone.example;

class Department
{
    private int id;
    private String name;
    
    public Department(int id, String name)
    {
        this.id = id;
        this.name = name;
    }
    
    
    int getid(){
        return this.id;
    }
    
    String getname(){
        return this.name;
    }
    void  setname(String str){
        this.name=str;
    }
    
}

class Employe implements Cloneable{
    
    private int empoyeeId;
    private String employeeName;
    private Department department;
    
    public Employe(int id, String name, Department dept)
    {
        this.empoyeeId = id;
        this.employeeName = name;
        this.department = dept;
    }
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
    
    int getempoyeId(){
        return this.empoyeeId;
    }
    
    String getemployeeName(){
        return this.employeeName;
    }
    
    Department getdepartment(){
        return department;
    }
    
}

public class CloneExample {
    
    public static void main(String[] args) throws CloneNotSupportedException {
        
        Department dept=new Department(12,"Cumputer engineering");
        
        Employe org =new Employe(12,"ali",dept);
        
        
        Employe cloned=(Employe)org.clone();
        
        System.out.println(cloned.getempoyeId());
        System.out.println(cloned.getemployeeName());
        System.out.println(cloned.getdepartment().getname());
        
        cloned.getdepartment().setname("Business management");
        
        System.out.println(cloned.getdepartment().getname());
        
        System.out.println(org.getdepartment().getname());
        
        //Verify JDK's rules
        
        //Must be true and objects must have different memory addresses
        System.out.println(org != cloned);
        
        //As we are returning same class; so it should be true
        System.out.println(org.getClass() == cloned.getClass());
        
        //Default equals method checks for references so it should be false. If we want to make it true,
        //then we need to override equals method in Employee class.
        System.out.println(!org.equals(cloned));
        
        
        
    }
    
}

