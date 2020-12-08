//  A class is a template that specifies how to make objects.

public class Classes { // The first line tells Java that we are declaring a class, called Classes.
	private int x;     // Next we declare two fields, int x and int y
	private int y;     // Field is the name for a variable that is inside of an object.
					   // Private means that only code inside of this class can directly manipulate these fields.
					   // Next is the declaration of a constructor for the class.
					   // A constructor specifies how to create objects of this class.
					   // It is code that gets run when an object is created to initialize that object.
	
	public Classes(int startx, int starty) {  // named the same as the class. These are the hallmarks of a constructor declaration
		// we have the word public, which means that any code can use this constructor to create a point.
		x = startx; 
		y = starty;
	}
	
	// we have three methods, getX, getY and distance. Methods are functions that are inside of classes. 
	// These methods are invoked or called on a particular object and implicitly act on that object.
	public int getX() { return x; }
	public int getY() { return y; }
	public double distance(Classes otherPt) {
		int dx = x - otherPt.getX() ; // This calls the get X method on the other point object. 
									  // It will get the X of that particular point object
		int dy = y - otherPt.getY() ;
		return Math.sqrt(dx * dx + dy * dy);
	}
	
	// Last, we have the Declaration of a static method.
	// They don't act on any particular instance of a class, they just belong to the class in general.
	public static void main (String[] args) { // Execution begins in main before any objects are even created.
		Classes p1 = new Classes (3, 4);
		Classes p2 = new Classes (6, 8);
		System.out.println(p1.distance(p2));
	}

}
