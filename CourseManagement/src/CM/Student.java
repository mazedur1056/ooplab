package CM;

public class Student extends Person {
	String sid;
	Course taken_course[] = new Course[2];
	
	public Student(){
		
	}
	
	public Student(String name, String pid, String sex, int age, String sid, Course taken_course[]){
		this.name=name;
		this.pid=pid;
		this.sex=sex;
		this.age=age;
		this.sid = sid;
		this.taken_course = taken_course;
	}
	
	public String getName(){
		return name;
	}
	public String getPid(){
		return pid;
	}
	public String getSex(){
		return sex;
	}
	public int getAge(){
		return age;
	}
	public String getSid(){
		return sid;
	}
	public Course[] getTaken_course(){
		return taken_course;
	}
	
	public void setName(String name){
		this.name = name;
	}
	public void getPid(String pid){
		this.pid = pid;
	}
	public void setSex(String sex){
		this.sex = sex;
	}
	public void setAge(int age){
		this.age = age;
	}
	public void setSid(String sid){
		this.sid = sid;
	}
	public void setTaken_course(Course taken_course[]){
		this.taken_course = taken_course;
	}
}
