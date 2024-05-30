package abstractfactory.pattern;

//Create Factory classes extending AbstractFactory to generate object of concrete class based on given information.
public class ShapeFactory extends AbstractFactory {
	@Override
	public Shapes getShape(String shapeType) {
		if (shapeType.equalsIgnoreCase("RECTANGLE")) {
			return new Rectangle();
		} else if (shapeType.equalsIgnoreCase("SQUARE")) {
			return new Shape();
		}
		return null;
	}
}