//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.ArrayList;
import java.util.Scanner;

public class Lab16b
{
	public static void main( String args[] )
	{
		NumberAnalyzer test = new NumberAnalyzer("5 12 9 6 1 4 8 6");
		System.out.println(test);
		System.out.println("odd count = "+test.countOdds());
		System.out.println("even count = "+test.countEvens());
		System.out.println("perfect count = "+test.countPerfects()+"\n\n");


		//add more test cases
		NumberAnalyzer test2 = new NumberAnalyzer("12 28 8 4 3 5");
		System.out.println(test2);
		System.out.println("odd count = "+test2.countOdds());
		System.out.println("even count = "+test2.countEvens());
		System.out.println("perfect count = "+test2.countPerfects()+"\n\n");

	}
}