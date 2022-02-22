package week1.day2.assignment;

public class SumOfDigits {

	public static void main(String[] args) {
int n=123;
int sum=0;
System.out.println("enter the number : " + n);

while (n>0)
{
	int r=n%10;
	sum=sum+r;
	n=n/10;
}
	
	System.out.println("sum of the digits: "+sum);
	
	}

}
