package Com;


class Bicycle2 {
	int gear;
	int speed;

	public Bicycle2(int gear, int speed) {
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

class MountainBike2 extends Bicycle2 {
	int seatHeight;

	public MountainBike2(int gear, int speed, int seatHeight) {
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

class harleyDavidson extends Bicycle2 {
	int mileAge;

	public harleyDavidson(int gear, int speed, int mileAge) {
		super(gear, speed);
		this.mileAge = mileAge;
	}

	void adjustMileage(int _value) {
		mileAge = _value;
	}

	@Override
	public String toString() {
		return "harleyDavidson [mileAge=" + mileAge + ", gear=" + gear + ", speed=" + speed + "]";
	}

}

public class MultiInheritance {

	public static void main(String[] args) {

		MountainBike1 bike = new MountainBike1(5, 160, 10);
		bike.speedUp(10);
		bike.applyBreak(5); // bike.adjustHeight(4);
		System.out.println(bike.toString());

		harleyDavidson bike2 = new harleyDavidson(5, 200, 45);
		bike2.applyBreak(100);
		bike2.speedUp(150);
		bike2.adjustMileage(40);
		System.out.println(bike2.toString());
	}

}


