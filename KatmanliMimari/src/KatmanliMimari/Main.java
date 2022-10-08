package KatmanliMimari;

import KatmanliMimari.busniness.CategoryManager;
import KatmanliMimari.busniness.CourseManager;
import KatmanliMimari.busniness.TeacherManager;
import KatmanliMimari.core.logging.DatabaseLogger;
import KatmanliMimari.core.logging.ILogger;
import KatmanliMimari.dataAccess.HivernateCategoryDao;
import KatmanliMimari.dataAccess.JdbcCourseManager;
import KatmanliMimari.dataAccess.JdbcTeacherDao;
import KatmanliMimari.entities.Category;
import KatmanliMimari.entities.Course;
import KatmanliMimari.entities.Teacher;

public class Main {

	public static void main(String[] args) throws Exception {
		ILogger[] loggers = {new DatabaseLogger()};
		System.out.println("--------Kategori---------------");
		Category category = new Category(1, "ali");
		CategoryManager categoryManager = new CategoryManager(new HivernateCategoryDao(), loggers);
		categoryManager.add(category);
		System.out.println("--------Egitmen---------------");
		Teacher teacher = new Teacher(2,"Fatih Caliskan");
		TeacherManager teacherManager = new TeacherManager(new JdbcTeacherDao(), loggers);
		teacherManager.add(teacher);
		System.out.println("--------Kurs---------------");
		Course course = new Course(1,"Oyun","Dddsdfs",23,category,teacher);
		CourseManager courseManager = new CourseManager(new JdbcCourseManager(),loggers);
		courseManager.add(course);
		
	}

}
