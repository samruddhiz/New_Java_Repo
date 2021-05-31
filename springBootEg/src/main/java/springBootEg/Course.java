package springBootEg;

public class Course {
	String courseid;
	String courseName;
	String description;
	
	
	
	public Course() {
		super();
	}
	public Course(String courseid, String courseName, String description) {
		super();
		this.courseid = courseid;
		this.courseName = courseName;
		this.description = description;
	}
	public String getCourseid() {
		return courseid;
	}
	public void setCourseid(String courseid) {
		this.courseid = courseid;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
}
