import java.util.Scanner;
public class gradeBook{

public static void main(String[] args){

	Scanner input = new Scanner(System.in);
	System.out.println("Welcome to the dev academy");
	System.out.println("Please indicate to us the language you would like to study");
	System.out.println("j > java, js > javascript, p > python, r > ruby, or any for html ans css");
	
	String program = input.nextLine();
	
	switch(program){
	 case "j":
		 System.out.println("Java introduction to programming consist of two part 1 and 2");
	 break;
	 
	 case "js":
	 	System.out.println("JavaScript modern web development with React and Back-end with Node.js/Express");
	 break;

	 case "p":
	 	System.out.println("Python for data science and machine learning");
	 break;

	 case "r":
	 	System.out.println("Ruby on rails for beginners");
	 break;

	 default:
	 	System.out.println("Introduction to web development with HTML5 and CSS3");

	}



}
}
