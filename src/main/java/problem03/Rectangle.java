package problem03;

public class Rectangle extends Shape implements Resizable {
	private double width;
	private double height;

	public Rectangle(double width, double height) {
	this.width=width;
	this.height=height;
	}

	@Override
	public void resize(double rate) {
		this.width=width*rate;
		this.height=height*rate;
	}

	@Override
	public double getArea() {
		double area=width*height;
		return area;
	}

	@Override
	public double getPerimeter() {
		
		return 2*width+2*height;
	}
}