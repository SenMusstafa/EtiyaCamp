
public class Instructor extends Person{

	private String instructorCourse;
	
	
	public Instructor(int id, String name, String instructorCourse) {
		super(id, name);
		this.instructorCourse = instructorCourse;
	}
	public Instructor() {
		super();
	}
	public String getInstructorCourse() {
		return instructorCourse;
	}
	public void setInstructorCourse(String instructorCourse) {
		this.instructorCourse = instructorCourse;
	}
 	
}
