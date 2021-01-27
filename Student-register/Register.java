import java.util.Scanner;
public class Register {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("This is simple student registry");
		System.out.println("Please enter your name");
		String stuName = input.next();
		System.out.println("Plaese enter your course");
		String course = input.next();
		System.out.println("Please enter your program");
		String program = input.next();
		System.out.println("Please enter the name of your department");
		String department = input.next();
		
//		process student data
		System.out.println(stuName+ ", your course name is " +course+ " you're doing " +program+ ", you're a student of " +department+ " department");

	}

}
