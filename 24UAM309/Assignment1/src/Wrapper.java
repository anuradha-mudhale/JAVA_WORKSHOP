import java.util.*;
public class Wrapper {
	public static void main(String args[])
	{
	int num;
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter Number:");
	num = sc.nextInt();
	System.out.println("Given Number:"+num);
	Integer b = new Integer(num);
	String c =  b.toBinaryString(num);
	System.out.println("Binary equivalent:"+c);
	String octal = b.toOctalString(num);
	System.out.println("Octal equivalent:"+octal);
	String hex = b.toHexString(num);
	System.out.println("Hexadecimal equivalent:"+hex);
	
}
}
