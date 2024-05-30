package abstractfactory.pattern;

//Create concrete classes implementing the same interface.
public class RoundedRectangle implements Shapes {
	@Override
	public void draw() {
		System.out.println("Inside RoundedRectangle::draw() method.");
	}
}