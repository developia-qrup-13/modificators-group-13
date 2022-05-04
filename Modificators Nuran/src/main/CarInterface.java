package main;

public interface CarInterface {
	default void carSpeed(String name, int speed) {
		System.out.println("Name :"+name+"   "+"Speed :"+speed);
	};
	
	default void carPrice(String name, int price) {
		System.out.println("Name :"+name+"   "+"Speed :"+price);
	};
	
}
