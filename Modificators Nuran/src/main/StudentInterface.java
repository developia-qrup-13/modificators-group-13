package main;

public interface StudentInterface {
	default void Student (String name, int classs, int point, String teachername) {
		System.out.println("Name :"+name+" "+"Speed :"+classs+" "+"Point :"+point+" "+"Teachername :"+teachername);
	};
}
