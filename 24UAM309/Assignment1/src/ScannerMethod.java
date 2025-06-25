import java.util.*;
public class ScannerMethod {
public static void main(String args[])
{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter two double values:");
	if(sc.hasNextDouble())
	{
		double a  = sc.nextDouble();
		double b = sc.nextDouble();
		double avg = (a+b)/2;
		System.out.println(avg);
}
	else
	{
		System.out.println("Invalid input");
	}
	sc.close();
}
}
