package overriding.covarient;

public class CovariantOverridingDemo {

	public static void main(String[] args) {
						Student student1 = new Student(1, "MCA", "Kapil");
						student1.printData();

						// Student object created using clone method
						// assuming type casting is required
						Student student2 = (Student) student1.clone();
						student2.printData();
		}
		// TODO Auto-generated method stub

}
