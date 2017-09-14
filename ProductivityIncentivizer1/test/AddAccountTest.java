import static org.junit.Assert.*;

import org.junit.Test;

public class AddAccountTest {

	@Test
	public void test() {
		fail("Not yet implemented");
	}
	
	@Test
	public void testStudentWorkerAccount() {
		ProductivityIncentivizer testRun = new ProductivityIncentivizer();
		assertTrue(testRun.addAccount("Joe Shmo", "1", ""));
	}

}
