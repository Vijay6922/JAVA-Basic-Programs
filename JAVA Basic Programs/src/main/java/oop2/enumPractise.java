package oop2;
 import java.lang.System;
enum A
{
	print,add,sub,div;    //declaring constants
}

public class enumPractise {

	public static void main(String[] args) {
		A a = A.add;
		System.out.println(a);
        System.out.println(a.ordinal());     //position of constants...
        
        if(a==A.add)
        {
        	System.out.println("true");
        }
        else
        {
        	System.out.println("false");
        }
        
        switch(a)
        {
        case print :
        {
        	System.out.println("ok");
        	break;
        }
        case add :
        {
        	System.out.println("10");
        	break;
        }
        case sub :
        {
        	System.out.println(" not ok");
        	break;
        }
        case div :
        {
        	System.out.println(" ok ok");
        	break;
        }
        }
	}

}
