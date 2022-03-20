import java.util.*;
public class ptc
{
    public static int portals(int[] dest)
    {
        // Write your code here.
        int n = dest.length;
        int arr[] = new int[n];
        int M = 1000000007;
        for(int i=1;i<n;i++)
        {
            arr[i] += arr[i-1];
            arr[i] += 1;
            arr[i] += (arr[i-1] - arr[dest[i-1]] + M) % M;
            arr[i] += 1;
            arr[i] %= M;
        }
        return arr[n-1];
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
		for(int j=0;j<T;j++)
		{
			int n = sc.nextInt();
			int arr[] = new int[n];
			for(int i=0;i<n;i++)
				arr[i] = sc.nextInt();
		    System.out.println(portals(arr));
	    }
    }
}