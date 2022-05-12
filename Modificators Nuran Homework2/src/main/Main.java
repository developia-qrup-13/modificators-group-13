package main;

public class Main {

	public static void main(String[] args) {
		Student student = new Student();
		student.setStudentName("Nuran");
		student.setPrice(8);
		student.setSubject("Programming");
		student.setTeachername("Rasim");
		System.out.println("Name :" + student.getStudentName() +"  " + "Price :" + student.getPrice()+"  " + "Subject :" + student.getSubject()+"  " + "Teacher Name :" + student.getTeachername());

	}

}
