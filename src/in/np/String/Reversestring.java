package in.np.String;
import java.util.Scanner;
public class Reversestring {

	public static void main(String[] args) {
		//String s = "Abhijeet";
		String s = new String();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		s = sc.next();
		String rev = "";
		for(int i = s.length()-1;i>=0;i--)
		{
			rev = rev + s.charAt(i);
		}
		System.out.println(rev);
		// TODO Auto-generated method stub

	}

}
