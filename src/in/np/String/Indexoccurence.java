package in.np.String;
import java.util.Scanner;
public class Indexoccurence {
	public static void main(String[] args)
	{
		int i;
		String str = "adbutsad";
		String str2 = "sad";int a=0;
		for(i=0;i<str.length();i++)
		{
			if(str.charAt(i)==str2.charAt(0))
			{
				System.out.println(i);
				System.out.println(str.substring(i,str2.length()+i));
			}
		 
	
		}
	}

}
