import java.util.Scanner;
public class FabionacciSeriesAndSumOfNSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number 1");
Scanner SC=new Scanner(System.in);
int n=SC.nextInt();

int b=n;
System.out.println(n+" "+b);
 
int c;

for(int i=1;i<=5;i++)
{
	c=n+b;
	System.out.println(" "+ " "+c);
	n=b;
	b=c;

int sum=0;
sum+=c;
c++;

System.out.println("sum = "+sum);

}
	}}