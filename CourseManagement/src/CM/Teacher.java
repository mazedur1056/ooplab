package CM;

public class Teacher extends Person {
	String tid;
	Course taking_course[] = new Course[10];

	public Teacher(){
		
	}
	
	public Teacher(String name, String pid, String sex, int age, String tid, Course taking_course[]){
		this.name=name;
		this.pid=pid;
		this.sex=sex;
		this.age=age;
		this.tid = tid;
		this.taking_course = taking_course;
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
	public String getTid(){
		return tid;
	}
	public Course[] getTaking_course(){
		return taking_course;
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
	public void setSid(String tid){
		this.tid = tid;
	}
	public void setTaken_course(Course taking_course[]){
		this.taking_course = taking_course;
	}
}
