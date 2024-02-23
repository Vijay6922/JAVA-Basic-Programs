package string;
import java.time.*;
import java.util.Scanner;
import java.util.Arrays;
public class practise {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LocalDate [] dates = new LocalDate[5];
        System.out.println("enter dates");
        for(int i =0;i<5;i++)
        {
        	String datesstr = sc.nextLine();
        	dates[i]=LocalDate.parse(datesstr);
        }
        Arrays.sort(dates);
        for(int i =0 ;i<5;i++)
        {
        	System.out.println(dates[i]);
        }
	}

}
