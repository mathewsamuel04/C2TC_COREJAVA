package day19;

interface A{
	void disp(String message);
}

public class Mainclass {
   public static void main(String[] args) {
	   A obj = new A(){
		   public void disp()
	   
	   {
			   System.out.println("HELLOO");
	   }
	   
	   };
		   obj.disp();
   
	   }
   }
   
