package project;
import java.util.Scanner;

public class sumofnumbers {
  static int SumOfEven(int a,int b)
	{
		int i,j=0;
		for(i=a;i<=b;i++)
		{
			if(i%2==0)
			{
				j=j+i;
			}
		}
		return j;
		
	}
  static int SumOfOdd(int a,int b)
	{
		int i,j=0;
		for(i=a;i<=b;i++)
		{
			if(i%2!=0)
			{
				j=j+i;
			}
		}
		return j;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a,b;
		System.out.println("Starting=");
		a=sc.nextInt();
		System.out.println("Ending=");
		b=sc.nextInt();
		
		System.out.println("Sumofeven="+SumOfEven(a,b) );
		System.out.println("Sumofodd="+SumOfOdd(a,b) );
		sc.close();
		
		
		

	}
	}


