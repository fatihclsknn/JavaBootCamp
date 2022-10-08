package KatmanliMimari.dataAccess;

import KatmanliMimari.entities.Teacher;

public class JdbcTeacherDao implements ITeacherDao{

	@Override
	public void add(Teacher teacher) {
		System.out.println("Jdbc ile öğretmen eklendi");
		
	}

}
