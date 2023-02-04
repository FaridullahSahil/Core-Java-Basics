package JavaClass;

public class NestedIFCondition {

	public static void main(String[] args) {
int age=17;
int weight=60;
if(age>=18) {
	if(weight>=50) {
		System.out.println("You can donate blood");
	}
	else {
		System.err.println("You are not eligible to donate blood");
	}
}
else {
	System.err.println("Your age is less then 18 years");
}
	}

}
