package springBootEg;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@RequestMapping("/hello")
	public String Index() 
	{
		return "Hi! Welcome to Spring Boot";
	}
	
	@RequestMapping("/courseList")
	public ArrayList<Course> getCourses()
	{
		ArrayList<Course> l = new ArrayList<>();
		l.add(new Course("C001","Java","Core concepts of Java"));
		l.add(new Course("C002","Servlet","Advanced concepts of Java"));
		l.add(new Course("C003","Spring","Advanced concepts of Java frameworks"));
		return l;
		//return "course List";
	}
}
