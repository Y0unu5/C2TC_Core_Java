package oops;

class Subject {
	private String subID;
	private String name;
	private int maxMarks;
	private int marksObtains;

	public Subject(String subID, String name, int maxMarks) {
		this.subID = subID;
		this.name = name;
		this.maxMarks = maxMarks;
	}

	public String getSubID() {
		return subID;
	}

	public String getName() {
		return name;
	}

	public int getMaxMarks() {
		return maxMarks;
	}

	public int getMarksObtains() {
		return marksObtains;
	}

	public void setMaxMarks(int mm) {
		maxMarks = mm;
	}

	public void setMarksObtain(int m) {
		marksObtains = m;
	}

	boolean isQualified() {
		return marksObtains >= maxMarks / 10 * 4;
	}

	@Override
	public String toString() {
		return "Subject [subID=" + subID + ", name=" + name + ", maxMarks=" + maxMarks + ", marksObtains="
				+ marksObtains + "]";
	}

}

public class Array_Ex {

	public static void main(String[] args) {
		Subject subs[] = new Subject[3];
		subs[0] = new Subject("s101", "DS", 100);
		subs[1] = new Subject("s101", "Algorthms", 100);
		subs[2] = new Subject("s101", "OP", 100);
		for (Subject s : subs)
			System.out.println(s);
	}

}
