import java.util.Scanner;

class RepeatedNum
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		int count=0,n;
		int[] arr=new int[100];
		int[] repeated=new int[50];
		int k=0;
		System.out.println("Enter the 1 to n:");
		n=in.nextInt();
		System.out.println("Enter the numbers:");
		for(int i=0;i<n;i++)
		{
			arr[i]=in.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			
			for(int j=0;j<n;j++)
			{
				if(arr[i]==arr[j])
				{
					count++;
				}
				if(count>=2)
				{
					repeated[k++]=arr[j];
					//System.out.println("The "+arr[j]+" is repeated");
					break;
				}
			}
			count=0;
		}
		for(int i=0;i<k;i++)
		{
			System.out.println("The "+repeated[i]+" is repeated");
		}
	}
}