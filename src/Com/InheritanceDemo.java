package Com;

class Bicycle1 {
	int gear;
	int speed;

	public Bicycle1(int gear, int speed) {
		this.gear = gear;
		this.speed = speed;
	}

	void applyBreak(int decrement) {
		speed -= decrement;
	}

	void speedUp(int increment) {
		speed += increment;
	}

	@Override
	public String toString() {
		return "Bicycle [gear=" + gear + ", speed=" + speed + "]";
	}

}

class MountainBike1 extends Bicycle1 {
	int seatHeight;

	public MountainBike1(int gear, int speed, int seatHeight) {
		super(gear, speed);
		this.seatHeight = seatHeight;
	}

	void adjustHeight(int value) {
		seatHeight = value;
	}

	@Override
	public String toString() {
		return "MountainBike [seatHeight=" + seatHeight + ", gear=" + gear + ", speed=" + speed + "]";
	}

}

public class InheritanceDemo {

	public static void main(String[] args) {

		MountainBike1 bike = new MountainBike1(5, 160, 10);
		bike.speedUp(10);
		bike.applyBreak(5); // bike.adjustHeight(4);
		System.out.println(bike.toString());

	}

}
