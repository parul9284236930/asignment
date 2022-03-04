import static org.junit.Assert.*;

import org.junit.Test;

public class SanityTest {

	@Test
	public void test1() {
		Calculator c=new Calculator();
		assertEquals(3,c.sum(1, 2));
	}
    
	@Test
	public void test2() {
		Calculator c=new Calculator();
		assertNotEquals(5,c.sum(1,2));
	}
	@Test
	public void test3() {
String str="Hello";
assertNotNull(str);
}
	@Test
	public void test4() {
String str=null;
assertNull(str);
}
	@Test
	public void test5() {
String str=null;
int a=100 ,b=20;

assertFalse(a<b);
}
}