package functional_programing;

@FunctionalInterface
interface car 
{
	public int drive(int speed,int gears);
}
class audi implements car
{
	public int drive(int s,int g)
	{
		System.out.println("audi");
		return 1;
	}
}

public class lamda_example {

	public static void main(String[] args) {
		
      car c = new audi();
     System.out.println(c.drive(2, 01));

	}

}
