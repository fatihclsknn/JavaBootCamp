package KatmanliMimari.dataAccess;

import KatmanliMimari.entities.Course;

public class JdbcCourseManager implements ICourseDao {

	@Override
	public void add(Course course) {
		System.out.println("Jdbc ile kurs eklendi");
		
	}

}
