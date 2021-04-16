import java.util.Scanner;
public class Greads {
public static void main(String args[]) {
		
	Scanner input = new Scanner(System.in);
	System.out.println("Students greads book");
	System.out.println("Enter integer of srudent greads from 0 to 100");
	
	int studentsGrades = input.nextInt();		
	
	if (studentsGrades >= 90) {
	System.out.println(studentsGrades+ " is A student");
	}
	else
	if (studentsGrades >= 80) {
		System.out.println(studentsGrades+ " is B student");
	}
	else
	if (studentsGrades >= 70) {
		System.out.println(studentsGrades+ " is C student");
	}
	else
	if (studentsGrades >= 60) {
		System.out.println(studentsGrades+ " is D student");
	}
	else {
		System.out.println(studentsGrades+ " is F student");
	}
		}
	}
