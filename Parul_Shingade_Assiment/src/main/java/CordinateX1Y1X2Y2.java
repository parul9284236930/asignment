import java.util.Scanner;
public class CordinateX1Y1X2Y2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the size of array ");
Scanner SC =new Scanner(System.in);
int n=SC.nextInt();
int x[]=new int [n];
System.out.println("enter the valur"+n+"values");
for(int i=0;i<x.length;i++)
{
	x[i]=SC.nextInt();
	System.out.println("user enter array");
	int sum=0;
	for (int j=1;j<x.length;j++)
	{
		sum+=x[i];
	}
	System.out.println("the resut is "+sum);
	}

}
}