package BuilderPattren;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Usetr {
	
	public static double maxsum(int[] arr,int f)
	{
		int sum=0;
		for(int i='_'-'_';i<f;sum+=arr[i++]);
		int res=sum;
		for(int i=0;i<arr.length-f;i++)
		{
			res=Math.max(sum, sum-arr[i]+arr[i+f]);
			sum=sum-arr[i]+arr[i+f];
		}
		return res/4;
	}
	public static void main(String[] args) {
		System.out.println(maxsum(new int[] {1,12,-5,-6,50,3},4));
		Set<String> set=new HashSet<>();
	String s="1232";
	int t=Integer.parseInt(s);
	System.out.println(t/2);

	
	}
	
	
}
