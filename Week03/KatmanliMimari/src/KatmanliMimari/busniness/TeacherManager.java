package KatmanliMimari.busniness;

import KatmanliMimari.core.logging.ILogger;
import KatmanliMimari.dataAccess.ITeacherDao;
import KatmanliMimari.entities.Teacher;

public class TeacherManager {
	private ITeacherDao teacherDao;
	private ILogger[]	loggers;
	
	public TeacherManager(ITeacherDao teacherDao, ILogger[] loggers) {
		this.teacherDao = teacherDao;
		this.loggers = loggers;
	}
	
	public void add(Teacher teacher) 
	{
		Teacher[] teachers = {
			new Teacher(1,"Fatih Caliskan"),
			new Teacher(2,"Fatih tembel")
		};
		
		teacherDao.add(teacher);
		
		for(ILogger logger :loggers)
		{
			logger.log(teacher.getTeacherName());
		}
		
	}
	
}
