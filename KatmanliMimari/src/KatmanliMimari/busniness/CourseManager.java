package KatmanliMimari.busniness;

import java.util.Arrays;

import KatmanliMimari.core.logging.ILogger;
import KatmanliMimari.dataAccess.ICourseDao;
import KatmanliMimari.entities.Category;
import KatmanliMimari.entities.Course;
import KatmanliMimari.entities.Teacher;

public class CourseManager {
	private ICourseDao	courseDao;
	private ILogger[]	loggers;
	
	public CourseManager(ICourseDao courseDao, ILogger[] loggers) {
		this.courseDao = courseDao;
		this.loggers = loggers;
	}
	

	public void add(Course course) throws Exception
	{
		Course[] courses = {
				new Course(1,"Java","Java ile programlama",200,course.getCourseCategory(),course.getCourseTeacher()),
				new Course(1,"C#","C# ile programlama",10,course.getCourseCategory(),course.getCourseTeacher()),
		};
		for (Course course2 : courses) {
			if(course2.getCourseName().equalsIgnoreCase(course.getCourseName()))
			{
				throw new Exception ("Kurs isimleri aynı olamaz");
			}
		}
		
		if (course.getPrice() < 0)
		{
			throw new Exception ("Kurs fiyatı sıfırdan az olamaz");
		}
		courseDao.add(course);
		for (ILogger logger : loggers) {
			logger.log(course.getCourseName());
		}
		
	}
	
}
