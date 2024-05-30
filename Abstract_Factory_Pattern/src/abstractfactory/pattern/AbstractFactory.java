package abstractfactory.pattern;

//Create an Abstract class to get factories for Normal and Rounded Shape Objects.
public abstract class AbstractFactory {
	abstract Shapes getShape(String shapeType);
}