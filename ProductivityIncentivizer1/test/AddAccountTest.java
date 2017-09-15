import static org.junit.Assert.*;

import org.junit.Test;

public class AddAccountTest {
	
	@Test
	public void testStudentWorkerAccount() {
		ProductivityIncentivizer testRun = new ProductivityIncentivizer();
		assertTrue(testRun.addAccount("Joe Shmo", "1", ""));
	}
	
	@Test
	public void testSupervisorAccount() {
		ProductivityIncentivizer testRun = new ProductivityIncentivizer();
		assertTrue(testRun.addAccount("Bossy Boss", "2", "123"));
	}
	
	@Test
	public void testSupervisorWithInvalidIdAccount() {
		ProductivityIncentivizer testRun = new ProductivityIncentivizer();
		assertTrue(testRun.addAccount("Joe Shmoooo", "2", "123"));
	}

}
