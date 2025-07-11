package javaProject;

public class Grade {
	public static void main(String[] args) {
		String grade="A";
		String result = switch (grade) {
		case "O" ->"Outstanding performance";
		case "A+" ->"Excellent performance";
		case "A" ->"Very good performance";
		case "B+" -> "Good performance";
		case "B" -> "Above average performance";
		case "C" -> "Average performance";
		case "P" -> "Pass";
		case "F" -> "Fail";
		default ->"Invalid Grade";
		};
		System.out.println("Grade: " + grade);
		System.out.println("Result: " + result);

	}
}
