package day19;

interface A{
	void disp();
}

public class Mainclass {
   public static void main(String[] args) {
	   A obj =new A(){
		   public void disp()
		   {
			   System.out.println("this is lambda function");
		   }
		   
		   
	   };
	   obj.disp();
   }

}


