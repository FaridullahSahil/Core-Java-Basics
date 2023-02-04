package JavaClass;

public class IfElseIfLadderStatement {

	public static void main(String[] args) {
		int marks=10;
		if(marks>=50&&marks<60) {
System.out.println("You passed");
	}
		else if(marks>=60&&marks<70) {
			System.out.println("You got grade A");
		}
		else if(marks>=70&&marks<80) {
			System.out.println("You got grade A+");
}
		else if(marks>=80&&marks<=100) {
			System.out.println("You got grade Exellent");
}
		else {
			System.err.println("You failed");
		}
	}}