import java.util.*;
import java.io.*;
class MicrosoftProgram
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your choice from 1 to 5\n1.count letters\n2.vowels&consonants\n3.reverse of string\n4.punctuations in string\n5.palindrome or not");
		int choice=sc.nextInt();
		System.out.println("enter a string you wish:");
		String str=sc.next();
		switch(choice)
		{
			case 1:
				int count=0;
				for(int i=0;i<str.length();i++)
				{
					if(str.charAt(i)!=' ')
						count++;
				}
				System.out.println("The number of characters in the string is:"+count);
				break;
			case 2:
				int vcount=0,ccount=0;
				for(int i=0;i<str.length();i++)
				{
				if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||
										str.charAt(i)=='o'||str.charAt(i)=='u')
				{
					vcount++;
				}
				else
				 	ccount++;
				}
				System.out.println("the number of vowels is:"+vcount);
				System.out.println("the number of consonants is:"+ccount);
				break;
			case 3:
				String rev="";
				for(int i=str.length()-1;i>=0;i--)
				{
					rev=rev+str.charAt(i);
				}
					System.out.println("the reverse of the string is:"+rev);
				break;
			case 4:
				int pcount=0;
				for(int i=0;i<str.length();i++)
				{
				if(str.charAt(i)=='!'||str.charAt(i)==','||str.charAt(i)==';'||str.charAt(i)=='.'||str.charAt(i)=='?'||str.charAt(i)==':')
				{
					pcount++;
				}
				}
				System.out.println("the number of panctuations is:"+pcount);
				break;
			case 5:
				String rev_str="";
				int length=str.length();
				for(int i=str.length()-1;i>=0;i--)
				{
					rev_str=rev_str+str.charAt(i);
				}
				if(str.equals(rev_str))
				{
					System.out.println("the entered string is palindrome");
				}
				else
					System.out.println("the entered string is not a palindrome");
					System.out.println("enter proper string");	
		}	
	}
}
