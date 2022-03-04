import java.util.Scanner;
public class IntegerAndSumOfOddNumberFromTheNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner SC=new Scanner(System.in);
System.out.println("enter the intiger");
int n=SC.nextInt();
int i=0;
int sum=0;
while (i<=n) {
	if (i%2!=0)
		sum+=i;
	i++;
}
System.out.println("is the even number"+" "+sum);
	}

}
