import java.util.*;
class CaseSensitive
{
	public static String invertCase(String str)
	{
		char[] chars=str.toCharArray();
		for(int i=0;i<chars.length;i++)
		{
		chars[i]=Character.isUpperCase(chars[i]) ? Character.toLowerCase(chars[i]) : Character.toUpperCase(chars[i]);
		}
		return new String(chars);
	}
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter a string:");
		String str=s.nextLine();
		System.out.println(invertCase(str));
	}
}

