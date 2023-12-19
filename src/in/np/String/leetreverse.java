package in.np.String;

import java.util.Scanner;

public class leetreverse {

	public static void main(String[] args) {
		String s = new String();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		s = sc.next();
		char[] ch = s.toCharArray();
		//String g = "";
		//char temp;
		//char[] h;
		for(int i = ch.length-1;i>=0;i--)
		{
	        char temp = ch[i];
		
		System.out.print(temp);
		}
		// TODO Auto-generated method stub


	}

}
