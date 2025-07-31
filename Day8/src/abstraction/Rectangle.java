package abstraction;

public class Rectangle extends Shape{
	private float width, height;

	public Rectangle() {
		this.width = 5.0f;
		this.height = 2.0f;
	}

	public Rectangle(float width, float height) {
		this.width = width;
		this.height = height;
	}

	@Override
	protected
	void calArea() {
		area=width*height;		
	}

	@Override
	protected void show() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void calArea1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void calArea11() {
		// TODO Auto-generated method stub
		
	}

}
