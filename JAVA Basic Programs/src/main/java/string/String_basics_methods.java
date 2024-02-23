package string;

public class String_basics_methods {

	public static void main(String[] args) {
		String a = "   vijay";
		int value = a.length();
		System.out.println(value);
		System.out.println(a.toUpperCase());
		System.out.println(a.toLowerCase());
		System.out.println(a.trim());
		System.out.println(a);
		System.out.println(a.substring(2,5));
		System.out.println(a.replace('j','k'));
		System.out.println(a.replace(' ','2'));
		System.out.println(a.startsWith("v"));
		System.out.println(a.endsWith("y"));
		System.out.println(a.charAt(5));
		System.out.println(a.indexOf("a"));
		System.out.println(a.indexOf("v"));
		System.out.println(a.lastIndexOf("v"));
		System.out.println(a.equals("   vijay"));
		System.out.println(a.equalsIgnoreCase("   vIJAY"));
	}

}
