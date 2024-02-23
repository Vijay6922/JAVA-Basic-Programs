package oop2;
import java.io.FileReader;
import java.io.RandomAccessFile;

public class raf {

	public static void main(String[] args) throws Exception{
		RandomAccessFile raf = new RandomAccessFile("/home/gvijaykumar/eclipse-workspace/java lang/eclipse-workspace/java lang/src/main/java/oop2/vijay.txt","r");
       // FileReader fr = new FileReader("/home/gvijaykumar/Desktop/vijay.txt");
        while(true)
        {
        	String s = raf.readLine();
        	if(s==null)
        	{
        		break;
        	}
        	System.out.println(s + " ");
        }
        raf.close();
        
	}

}
