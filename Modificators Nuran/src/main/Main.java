package main;

public class Main {

	public static void main(String[] args) {
		Student student = new Student();
		student.name= "Nuran";
		student.classs = 8;
		student.point = 5;
		student.teachername = "Rasim";
		StudentInterface studentinterface = new Student();
		studentinterface.Student(student.name, student.classs, student.point, student.teachername);
		
	}

}
