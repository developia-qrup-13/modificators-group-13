package main;

public class Main {

	public static void main(String[] args) {
		// ctrl+shift+F
		Student std = new Student();
		std.setClassName("8a");
		std.setPrice(9);
		std.setStudentName("Toğrul");
		std.setSubject("Fizika");
		std.setTeachername("Tünzalə");
		
		System.out.println(std.classOfStudent(std.getStudentName(), std.getClassName()));
		System.out.println("Qiyməti "+std.priceOfStudent(std.getPrice()));
		System.out.println(std.subjectOfStudent(std.getSubject(), std.getTeachername()));


	}

}
