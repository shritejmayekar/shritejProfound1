import java.util.Scanner;
class prime {
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		
		System.out.print("Enter the range");
		int n=in.nextInt();
		int count=0,k=0;
		int[] a=new int[20];
		int[] b=new int[20];
		for(int i=0;i<n;i++)
		{
			System.out.print("Enter the number:");
			a[i]=in.nextInt();
			
		}
		
		for(int i=0;i<n;i++)
		{
			count=0;
			int num=a[i];
			for(int j=1;j<=num;j++)
			{
				if(num%j==0)
				{
					count++;
				}
				if(count==2)
				{
					b[k++]=num;
				}
			}
		}
		
		System.out.print("The prime are:");
		for(int j=0;j<k;j++)
		{
			System.out.println(b[j]);
		}
	}
}
				
				
