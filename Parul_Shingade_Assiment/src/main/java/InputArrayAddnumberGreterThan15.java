import java.util.Scanner;
public class InputArrayAddnumberGreterThan15 {

	public static void main(String[] args) {
		System.out.println("Enter the Size of Array :");
		// TODO Auto-generated method stub
Scanner SC=new Scanner(System.in);
int n=SC.nextInt();

int X[]=new int[n];
System.out.println("Enter"+n+"value");
for(int i=0;i<X.length;i++)
{
	X[i]=SC.nextInt();
	
}
System.out.println("user entered array");
int sum=0;
 
for(int i=0;i<X.length;i++)
{    if (X[i]>15)
	sum+=X[i];
	
}
System.out.println("the sum of the array element is :"+sum);
	
 
int rev =0;
do {
	int d=sum%10;
	rev=rev*10+d;
	sum=sum/10;
}while(sum!=0);
System.out.println("is the reverse of sum"+rev);
	
}
}

