import java.util.*;
import java.lang.*;
class workstring
{
	public static void main(String args[])
	{
		int i,count=0;
		Scanner s=new Scanner(System.in);
		System.out.println("enter the string:");
		String s1=s.nextLine();
		StringTokenizer str=new StringTokenizer(s1);
		while(str.hasMoreTokens())
		{
			String s2=str.nextToken();
			for(i=0;i<s2.length();i++)
			{
			if(s2.charAt(i)=='a'||s2.charAt(i)=='e'||s2.charAt(i)=='i'||s2.charAt(i)=='o'||s2.charAt(i)=='u')
			{
				count++;
			}	
			}
			System.out.println("words in  "+s2+" are:  "+count);
		}	
	}
}
