package abstractfactory.pattern;

public class Rectangle implements Shapes {
	@Override
	public void draw() {
		System.out.println("Inside Rectangle::draw() method.");
	}
}