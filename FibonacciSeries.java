package week1.day2.assignment;

public class FibonacciSeries {
//0,1,1,2,3,5,8,13

	public static void main(String[] args) {
		int range=8, n1=0 ,n2=1;
 System.out.println("Fibonacci series of " +range+ " numbers:");	
		
		for (int i = 1; i <=range ; i++)
		{
			System.out.println(n1+" ");
           int  sum=n1+n2;
			n1=n2;
			n2=sum;
	}
		}
}
