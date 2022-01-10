package Com;

public class Student {
	int id;
	String name;
	String email;
	String batch;

	public Student() {

	}

	public Student(int id, String name, String email, String batch) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.batch = batch;
	}

	public Student(int id) {

		this.id = id;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", email=" + email + ", batch=" + batch + "]";
	}

	public static void main(String[] args) {

		Student s1 = new Student();
		s1.id = 111;
		s1.name = "younus";
		s1.email = "mkyunus";
		s1.batch = "B7";
		System.out.println(s1.toString());

		Student s2 = new Student(121, "Saqlain", "saq123", "B8");
		System.out.println(s2.toString());

		Student s3 = new Student();
		s3.id = 103;
		System.out.println(s3.toString());
	}

}
