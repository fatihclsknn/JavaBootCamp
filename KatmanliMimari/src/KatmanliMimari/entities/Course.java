package KatmanliMimari.entities;

public class Course {
	private int			id;
	private	String		courseName;
	private	String		courseDescription;
	private double		price;
	private Category	courseCategory;
	private	Teacher		courseTeacher;
	public Course() {
		
	}
	public Course(int id, String courseName, String courseDescription, double price, Category courseCategory,
			Teacher courseTeacher) {
		super();
		this.id = id;
		this.courseName = courseName;
		this.courseDescription = courseDescription;
		this.price = price;
		this.courseCategory = courseCategory;
		this.courseTeacher = courseTeacher;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getCourseDescription() {
		return courseDescription;
	}
	public void setCourseDescription(String courseDescription) {
		this.courseDescription = courseDescription;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Category getCourseCategory() {
		return courseCategory;
	}
	public void setCourseCategory(Category courseCategory) {
		this.courseCategory = courseCategory;
	}
	public Teacher getCourseTeacher() {
		return courseTeacher;
	}
	public void setCourseTeacher(Teacher courseTeacher) {
		this.courseTeacher = courseTeacher;
	}

	
	
	
	
	
	
}
