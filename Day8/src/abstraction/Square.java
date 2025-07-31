package abstraction;

public class Square extends Shape {
	private float side;
	public Square()
	{
		side=2.0f;
	}
	public Square(float side)
	{
		this.side=side;
	}
	
	@Override
	protected
	void calArea() {
		super.area=side*side;		
	}
	@Override
	void calArea1() {
		// TODO Auto-generated method stub
		
	}
	@Override
	protected void show() {
		// TODO Auto-generated method stub
		
	}
	@Override
	protected void calArea11() {
		// TODO Auto-generated method stub
		
	}

}
