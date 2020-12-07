public class lang 
{
	/*
	 * Question 1. Suppose you have written a Java program that has one class and one method.
	 * Which one of the following best describes what you need to do in order to run the program?
	 * 
	 * Answer 1. Compile the program, create a new object for the class, and call the method.
	 * A program must be compiled before objects can be created.
	 */
	//a single comment line 
	//starts with two forward slashes 
	//the next line is not a comment without //

	/*keywords: reserved by Java, highlighted in blue in Netbeans (other colors
	           in other IDEs
	           
	           public ==> anyone can see it/use it
	           private ==> only certain parts of code can see it/use it
	           class ==> an object which can be instantiated (created)
	           new  ==> the word used to instantiate an object
	           static ==> available without instantiation
	*/

	/*parts of code syntax:
	*          { ==> left curly brace -- opens a code block
	*          } ==> right curly brace -- closes a code block
	*          " ==> quote -- starts and ends String literals (variables)
	*          [ ==> left bracket -- opens an array and contains size indicator
	*          ] ==> right bracket -- closes an array
	*          ; ==> semi-colon -- ends a directive
	*/
	public static void main(String[] args) {
		int a = 3;
		int b = 4 + a / 2;
		int c = b % 3;
		System.out.println(c);
		}
}











