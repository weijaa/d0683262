import static org.junit.Assert.*;

import org.junit.Test;

public class TriangleTest {

Triangle t = new Triangle();
	
	@Test
	public void test() {
		assertEquals("���T����",t.checkTriangle(11, 11, 11));
	}
	@Test
	public void test2() {
		assertEquals("�����T����",t.checkTriangle(3, 4, 5));
	}
	@Test
	public void test3() {
		assertEquals("���y�T����",t.checkTriangle(11, 11, 10));
	}
	@Test
	public void test4() {
		assertEquals("�T����",t.checkTriangle(3, 7, 5));
	}
	
	// @Test(expected = Exception.class)
	// public void test5() throws  Exception {
	// 	assertEquals("���y�T����",t.checkTriangle(5, 3, 3));

	// }	
	@Test
	public void test6() {
		assertEquals("���O�T����",t.checkTriangle(3, 789, 5));
	}
}
