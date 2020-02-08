package CM;

public class Person {
	String name;
	String pid;
	String sex;
	int age;
	public Person(){
		
	}
	public Person(String name, String pid, String sex, int age){
		this.name=name;
		this.pid=pid;
		this.sex=sex;
		this.age=age;
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
	public String getPersonInfo(){
		return ("Name: "+getName()+"\nPerson ID: "+getPid()+"\nSex: "+getSex()+"\nAge: "+getAge());
	}
}
