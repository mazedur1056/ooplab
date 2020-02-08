package CM;

public class Course {
	String course_id;
	String course_name;
	
	public Course(String course_id, String course_name){
		this.course_id = course_id;
		this.course_name = course_name;
	}
	public String getCourse_id(){
		return course_id;
	}
	public String getCourse_name(){
		return course_name;
	}
	public void setCourse_id(String id){
		this.course_id = id;
	}
	public void setCourse_name(String name){
		this.course_name = name;
	}
}
