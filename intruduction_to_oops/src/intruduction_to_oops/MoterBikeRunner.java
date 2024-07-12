package intruduction_to_oops;

public class MoterBikeRunner {

	public static void main(String[] args) {

		MoterBike ducati = new MoterBike(100);
		MoterBike honda = new MoterBike(80);
		MoterBike hero = new MoterBike();

		System.out.println(ducati.getSpeed());
		System.out.println(honda.getSpeed());
		System.out.println(hero.getSpeed());

		ducati.start();
		honda.start();

		// ducati.setSpeed(100);
		// honda.setSpeed(80);

		ducati.increaseSpeed(700);
		honda.increaseSpeed(600);
		hero.increaseSpeed(2);


		System.out.println(ducati.getSpeed());
		System.out.println(honda.getSpeed());
		System.out.println(hero.getSpeed());

		ducati.decreaseSpeed(700);
		honda.decreaseSpeed(4000);
		hero.decreaseSpeed(4);

		System.out.println("Decrease speed are :");

		System.out.println(ducati.getSpeed());
		System.out.println(honda.getSpeed());
		System.out.println(hero.getSpeed());

		// ducati.setSpeed(20);
		// System.out.println(ducati.getSpeed());

		// honda.setSpeed(0);
		// System.out.println(honda.getSpeed());
	}

}
