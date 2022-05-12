package main;

public class Student implements StudentInterface{
	String name;
	int classs;
	int point;
	String subject;
	String teachername;
	@Override
	public  String Student (String name, int classs, int point, String teachername){
	     return "Name :"+name+" "+"Speed :"+classs+" "+"Point :"+point+" "+"Teachername :"+teachername;
}
