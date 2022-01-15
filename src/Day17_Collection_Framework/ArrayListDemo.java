package Day17_Collection_Framework;

import java.util.ArrayList;
import java.util.Iterator;

class Student1 {
	int id;
	String name;
	int grade;

	public Student1(int id, String name, int grade) {
		super();
		this.id = id;
		this.name = name;
		this.grade = grade;
	}

	@Override
	public String toString() {
		String str = "Student is [" + id + "," + name + "," + grade + "]";
		return str;
	}

}

class Employee1 {
	int id;
	String name;
	String email;
	float salary;

	public Employee1(int id, String name, String email, float salary) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee1 [id=" + id + ", name=" + name + ", email=" + email + ", salary=" + salary + "]";
	}

}

public class ArrayListDemo {

	public static void main(String[] args) {
		Student1 s1 = new Student1(101, "Harry", 10);
		Student1 s2 = new Student1(102, "Ptter", 10);
		Integer i = new Integer(100);
		String s = "Collection Example";
		Float f = new Float(30.5f);
		Character ch = new Character('C');
		Employee1 e1 = new Employee1(111, "Younus", "mkyounus", 45.4f);
		Employee1 e2 = new Employee1(112, "Thor", "thor@gmail", 50.5f);
		Employee1 e3 = new Employee1(112, "Hulk", "Hulkr@gmail", 60.5f);
		Employee1 e4 = new Employee1(112, "Tony", "tonys@gmail", 70.5f);

		ArrayList al1 = new ArrayList();
		al1.add(0, i);
		al1.add(1, s);
		al1.add(s1);
		al1.add(s2);

		System.out.println("Size" + al1.size());

		ArrayList al2 = new ArrayList();
		al2.add(e1);
		al2.add(e2);
		al2.add(e3);

		al2.add(e4);
		System.out.println("Size" + al2.size());
		Iterator i1 = al1.iterator();
		while (i1.hasNext()) {
			Object o = i1.next();
			System.out.println(o);
		}

	}

}
