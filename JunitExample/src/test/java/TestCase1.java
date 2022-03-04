import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;

 public class TestCase1 {

	
		
		@Test(timeout=1000)
		public void test1() {
		System.out.println("Inside the test1");
		try {
		Thread.sleep(2000);
		}
		catch(Exception e) {
		System.out.println(e);
		}
		}}
		
