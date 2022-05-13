package main;

public class Student implements StudentInterface {
	private String studentName;
	private String className;
	private int price;
	private String subject;
	private String teachername;

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getTeachername() {
		return teachername;
	}

	public void setTeachername(String teachername) {
		this.teachername = teachername;
	}

	@Override
	public String classOfStudent(String studentName, String className) {
		return "Tələbənin adı " + studentName + " Sinif adı " + className;
	}

	@Override
	public int priceOfStudent(int price) {
		return price;
	}

	@Override
	public String subjectOfStudent(String subject, String teacherName) {
		return "Fənnin adı " + subject + " Müəllimin adı " + teacherName;
	}

}
