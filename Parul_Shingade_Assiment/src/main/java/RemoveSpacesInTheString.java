import java.util.Scanner;
public class RemoveSpacesInTheString {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner SC=new Scanner(System.in);
		System.out.print("Enter the String :");
		String Str1=SC.nextLine();
	    int count[]=new int[128];
          
	        //Removes the white spaces using regex  
	        str1 = str1.replaceAll("\\s+", "");  
	          
	        System.out.println("String after removing all the white spaces : " + str1);  
	    }  
	}   
 
	


