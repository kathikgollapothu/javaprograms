import java.util.*;
public class ReverseWords
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("enter a sentence:");
		String str=sc.nextLine();
		
		String words[]=str.split("\\s");
		String revstr="";
		for(int i=0;i<words.length;i++)
		{
			String word=words[i];
			String revword="";
			for(int j=word.length()-1;j>=0;j--)
			{
				revword=revword+word.charAt(j);
			}
			revstr=revstr+revword+" ";
		}
		System.out.println("Reversed sentence is:"+revstr);
	}
}
