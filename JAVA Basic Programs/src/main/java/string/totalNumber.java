package string;

public class totalNumber {

	public static void main(String[] args) {
		String s = "1,2,3,a,d,4,f,445,2,23,5,3,gg,35";
		char[] c = s.toCharArray();
		int  total=0;
//		for(int i =0;i<s.length();i++)
//		{
//			System.out.print(c[i] + " ");
//		}
		for(int i =0;i<c.length;i++)
		{
		     if((c[i]>='0')&&(c[i]<='9'))
		     {
		    	 total=total+Character.getNumericValue(c[i]);
		     }
		}
		System.out.println(total);

	}

}
