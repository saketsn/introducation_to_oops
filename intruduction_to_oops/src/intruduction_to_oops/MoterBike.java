package intruduction_to_oops;

public class MoterBike {

	// state
	private int speed;

	MoterBike() {
		this(5);// calling constructor using constructor
	}

	MoterBike(int speed) {
		this.speed = speed;
	}


	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		if (speed > 0) {
			this.speed = speed;
		}
	}

	public void increaseSpeed(int howMuch) {
		this.speed = this.speed + howMuch;
	}

	public void decreaseSpeed(int howMuch) {
		this.speed = this.speed - howMuch;
	}

	public void start() {

		System.out.println("Bike started");
	}
}
