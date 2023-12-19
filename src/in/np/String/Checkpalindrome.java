package in.np.String;
import java.util.Scanner;
public class Checkpalindrome {

	public static void main(String[] args) {
		int i;
		String str = new String();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		str = sc.next();
		boolean check = true;
		char[] ch = str.toCharArray();
		for( i=0;i<ch.length;i++)
		{
			if(ch[i] != ch[ch.length-1-i])
			{
				check = false;
				break;
			}
		}
		if(check == true)
		{
			System.out.println("It is Palindrome");
		}
		else
		{
			System.out.println("It is not Palindrome");
		}
		
		

	}

}
