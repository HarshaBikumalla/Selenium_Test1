package Selenium.Automation;

public class TypeCasting
{
	public void WideningTypeCasting()
	{
		int x=10;
		float y=x;
		
		System.out.println(x);
		System.out.println(y);
	}
	
	public void NarrowingTypeCasting()
	{
		float x1= 10.5f;
		int y1=(int)x1;
		
		System.out.println(y1);
		
	}
	
	public static void main(String[] args)
	{
		TypeCasting casting1=new TypeCasting();
		casting1.NarrowingTypeCasting();
		
		int xx=10;
		System.out.println(xx);
		
		

		casting1.WideningTypeCasting();
		
		casting1.NarrowingTypeCasting();
		

		
	}
	



}
