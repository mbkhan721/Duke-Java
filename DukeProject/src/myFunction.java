/*public class myFunction {
	static void myMethod() {
	    System.out.println("I just got executed!");
	  }

	  public static void main(String[] args) {
		  myMethod();
	  }
} */

class myFunction {

	  // create a method
	  public int addNumbers(int a, int b) {
	    int sum = a + b;
	    // return value
	    return sum;
	  }

	  public static void main(String[] args) {
	    
	    int num1 = 25;
	    int num2 = 15;

	    // create an object of Main
	    myFunction obj = new myFunction();
	    // calling method
	    int result = obj.addNumbers(num1, num2);
	    System.out.println("Sum is: " + result);
	  }
	}