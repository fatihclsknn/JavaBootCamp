package KatmanliMimari.dataAccess;

import KatmanliMimari.entities.Course;

public class HibernateCourseDao implements ICourseDao{

	@Override
	public void add(Course course) {
		System.out.println("Hibarnete ile kurs eklendi");
		
	}

}
