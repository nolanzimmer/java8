package intrw;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

// To find the second highest marks of a student from an object
class Student {

	private String name;

	private int marks;

	// Parameterised constructor
	public Student(String name, int marks) {
		super();
		this.name = name;
		this.marks = marks;
	}

	// Getter Setter methods
	public String getName() {
		return name;
	}

	public int getMarks() {
		return marks;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

}

public class SomeClass {
	
	private static void secondHighestMarks() {
		
		List<Student> studentList = Arrays.asList(new Student("ABC", 20), new Student("DEF", 5), new Student("GHI", 40));
		
		//Store this value in an Optional variable
		Optional<Integer> secondHighest = studentList.stream().map(Student::getMarks).distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst();
		
		if (secondHighest.isPresent()) {
			System.out.println("Second highest marks are: "+secondHighest.get());
		}
		else {
			System.out.println("Second highest marks not found");
		}
		
	}
	
	public static void main(String[] args) {
		secondHighestMarks();
	}

}