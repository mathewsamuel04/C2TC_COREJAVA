package abstraction;

public abstract class Shape {
	  protected float area;
	     
	     //abstract method 
		 abstract void calArea1();
		 
		 //concrete method
		 void show1()
		 {
			 System.out.println("Area of shape is "+area);
		 }

		protected abstract void show();

		protected abstract void calArea11();

		protected abstract void calArea();

		public void calArea111() {
			// TODO Auto-generated method stub
			
		}

		public void show11() {
			// TODO Auto-generated method stub
			
		}

}
