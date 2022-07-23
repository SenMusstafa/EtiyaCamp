import java.util.ArrayList;
import java.util.List;

public class InstructorManager {

	public void addInstructor(Instructor instructor){
		System.out.println(instructor.instructorName + " yeni eğitmen eklendi.");
	}
	
	public void deleteInstructor(Instructor instructor){
		System.out.println(instructor.instructorName + " Kursu Silindi.");
	}
	public void updateInstructor(Instructor instructor){
		System.out.println(instructor.instructorName + " Kurs Güncelledi.");
	}
	public List<Course> getAll(){
		return new ArrayList<Course>();
	}
}
