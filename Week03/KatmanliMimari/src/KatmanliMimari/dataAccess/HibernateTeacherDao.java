package KatmanliMimari.dataAccess;

import KatmanliMimari.entities.Teacher;

public class HibernateTeacherDao implements ITeacherDao{

	@Override
	public void add(Teacher teacher) {
		System.out.println("Hibernate ile öğretmen eklendi");
		
	}

}
