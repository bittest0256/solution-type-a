package problem03;

public class RectTriangle extends Shape {
	private double width;
	private double height;

	public RectTriangle(double width, double height) {
		this.width=width;
		this.height=height;
	}

	@Override
	public double getArea() {
		double area=(width*height)/2;
	//	System.out.print(width);
		return area;
	}

	@Override
	public double getPerimeter() {
	
		
		return Math.sqrt(width*width+height*height)+width+height;
	}
}
