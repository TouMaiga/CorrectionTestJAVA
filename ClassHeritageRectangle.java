package testsamedi;

public class ClassHeritageRectangle {

	public static void main(String[] args) {
		
		Rectangle myRec = new Rectangle (2 , 4);
		System.out.println(myRec.surface());
	
	}
}

class Rectangle {
	int a;
	int b;

	public Rectangle(int a, int b) {
		this.a = a;
		this.b = b;
	}

	int surface() {
		int surface = a * b;

		return surface;
	}

}
