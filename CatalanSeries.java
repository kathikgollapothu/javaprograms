import java.util.*;
public class CatalanSeries
{
	public static void main(String[] args) {
	        int n=10;	
		int arr[]=new int[n+1];
		for(int i=n;i>=0;i--) arr[i]=0;
		
		arr[0]=1;
		arr[1]=1;
		
		for(int i=2;i<=n;i++)
		    for(int j=0;j<i;j++)
		        arr[i]+=arr[j]*arr[i-j-1];
		for(int i=0;i<=n;i++)
		    System.out.print(arr[i]+" ");
	}
}
