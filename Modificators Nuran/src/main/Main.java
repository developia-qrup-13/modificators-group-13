package main;

public class Main {

	public static void main(String[] args) {
		Car car = new Car();
		car.name= "Mercedes";
		car.speed = 300;
		car.price = 999999;
		CarInterface carinterface = new Car();
		carinterface.carPrice(car.name, car.speed);
		carinterface.carPrice(car.name, car.price);
		
	}

}
