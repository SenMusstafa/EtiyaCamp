import java.util.ArrayList;
import java.util.List;

public class UserManager {
	
	List<Person> persons;
	
	public List<Course> getAll(){
		return new ArrayList<Course>();
	}
	
	public void add(Person user){
		System.out.println(user.getName() + " Kayıt Eklendi.");
	}
	
	public void delete(Person user){
		System.out.println(user.getName() + " Kayıt Silindi.");
	}
	public void update(Person user){
		System.out.println(user.getName() + " Kayıt Güncelledi.");
	}
}
