package abstractfactory.pattern;

public class RoundedShapeFactory extends AbstractFactory {
	@Override
	public Shapes getShape(String shapeType) {
		if (shapeType.equalsIgnoreCase("RECTANGLE")) {
			return new RoundedRectangle();
		} else if (shapeType.equalsIgnoreCase("SQUARE")) {
			return new RoundedSquare();
		}
		return null;
	}
}