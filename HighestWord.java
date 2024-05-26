import java.util.*;
class HighestWord
{
	static int LongestWordLength(String str)
	{
		String []words=str.split(" ");
		int len=0;
		for(String word:words)
		{
			if(len<word.length())
			{
				len=word.length();
			}
		}
		return len;
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string:");
		String str=sc.nextLine();
		System.out.println(LongestWordLength(str));
	}
}
