class student{
	private final String name;
	private final String surename; 
	private final int id;
	private final  Lesson lesson;
	
	student(int id ,String name ,String surename,Lesson lesson){
		this.name=name;
		this.id=id;
		this.surename=surename;
		Lesson copylesson=new Lesson();
		
		copylesson.setlesson_name(lesson.getlesson_name());
		copylesson.setmidterm(lesson.getmidterm());
		copylesson.setFinal(lesson.getFinal());
		this.lesson=copylesson;
	}
	
	Lesson getLesson() {
		Lesson copyoflesson=new Lesson();
		copyoflesson.setlesson_name(this.lesson.getlesson_name());
		copyoflesson.setmidterm(this.lesson.getmidterm());
		copyoflesson.setFinal(this.lesson.getFinal());
		return copyoflesson;
	}
	String getname() {
		return this.name;
	}
	
	String getsurename() {
		return this.surename;
	}
	int getId() {
		return this.id;
	}

	@Override
	public String toString() {
		return "Student Name :"+this.name+" "+this.surename+" Id:"+this.id+" Lesson:"+this.lesson.getlesson_name()+" average: "+((this.lesson.getmidterm()*40)+(this.lesson.getFinal()*60))/100;
	}
		
	
	
	}

class Lesson{
	private String lesson_name;
	private int midterm;
	private int Final;
	
	
	
	String  getlesson_name() {
		return this.lesson_name;
	}
	
	int getmidterm() {
		return this.midterm;
	}
	
	int getFinal() {
		return this.Final;
	}
	
	void  setlesson_name(String lesson_name) {
       this.lesson_name=lesson_name;
	}
	
	void setmidterm(int midterm) {
		this.midterm=midterm;
	}
	
	void setFinal(int Final) {
		this.Final=Final;
	}
	

	
}
	
	







public class Main {

	public static void main(String[] args) {
		Lesson lesson=new Lesson();
		lesson.setlesson_name("Math");

		lesson.setmidterm(60);

		lesson.setFinal(70);
		
		
		student student1=new student(170304,"Ali","Almane",lesson);
		lesson.setlesson_name("C#");

		lesson.setmidterm(60);

		lesson.setFinal(100);
		
		

		System.out.println(student1);
		student1.getLesson().setFinal(80);
		student1.getLesson().setlesson_name("C#");
		System.out.println(student1);
		


	
		
		
	}

}
