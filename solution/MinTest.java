import junit.framework.*;
import org.junit.Test;

public class MinTest extends TestCase {
	@Test
	public void testTrue() throws Exception {
		assertEquals(true, true);
	}

	@Test
	public void test1() throws Exception {
		int[] arrayWithValues = new int[]{0, 1};
		assertEquals(0, Min.foundMin(arrayWithValues));
	}

	@Test
	public void test2() throws Exception {
		int[] arrayWithValues = new int[]{8, 12, -2, 5};
		assertEquals(-2, Min.foundMin(arrayWithValues));
	}
}
