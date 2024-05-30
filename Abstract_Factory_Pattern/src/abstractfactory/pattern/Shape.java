package abstractfactory.pattern;

public class Shape implements Shapes {

	@Override
	public void draw() {
		System.out.println("Inside Shape::draw() method.");
	}

}
