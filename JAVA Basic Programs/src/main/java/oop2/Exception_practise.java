package oop2;

import java.util.Arrays;

class myclass extends Exception 
{

	public void print() 
	{
	System.out.println("ok");
}
}
class b
{
	int a=9;
	public void print()throws myclass    //shows error in function
	{
	
		if(a!=9)
		{
			throw new myclass();       //throwing the class or function....
		}
	}
	public String toString()
	{
		return a + " ";
	}
}

public class Exception_practise {

	public static void main(String[] args) {
		myclass c = new myclass();
		b obj = new b();
		try
		{
			obj.print();
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
		
		System.out.println(obj);

	}

}
