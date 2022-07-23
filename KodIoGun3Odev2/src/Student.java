
public class Student extends Person{
	
	private String studentLastName;
	private String studentCourse;
	
	
	public Student(int id, String name,String studentLastName,String studentCourse) {
		 super(id, name);
		 this.studentLastName = studentLastName;
		 this.studentCourse = studentCourse;
	 }
	
	
	public Student() {
		super();
	}
	
	public String getStudentLastName() {
		return studentLastName;
	}
	public void setStudentLastName(String studentLastName) {
		this.studentLastName = studentLastName;
	}
	public String getStudentCourse() {
		return studentCourse;
	}
	public void setStudentCourse(String studentCourse) {
		this.studentCourse = studentCourse;
	}
	
	
}
