import java.util.*;
public class AsciiValue
{
	public static void  main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String:");
		String str=sc.nextLine();
		int len=str.length();
		
		char lowercaselow=255;
		char lowercasehigh=0;
		char uppercaselow=255;
		char uppercasehigh=0;
		
		for(int i=0;i<len;i++)
		{
			char ch=str.charAt(i);
			if(Character.isLowerCase(ch))
			{
				if(ch<lowercaselow)
				{
					lowercaselow=ch;
				}
				if(ch>lowercasehigh)
				{
					lowercasehigh=ch;
				}
			}
			else if(Character.isUpperCase(ch))
			{
				if(ch<uppercaselow)
				{
					uppercaselow=ch;
				}
				if(ch>uppercasehigh)
				{
					uppercasehigh=ch;
				}
			}
			
		}
		System.out.println("The character with lowest ascii value in lowercase is:"+lowercaselow);
		System.out.println("The character with highest ascii value in lowercase is:"+lowercasehigh);
		System.out.println("The character with lowest ascii value in uppercase is:"+uppercaselow);
		System.out.println("The character with highest ascii value in uppercase is:"+uppercasehigh);
	}
	
}
