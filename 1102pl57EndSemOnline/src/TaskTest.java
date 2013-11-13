import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class TaskTest {
Task task;
	@Before
	public void setUp() throws Exception {
		task=new Task();
	}

	@Test
	public void testGetTask() {
		task.setTask("DesignUI");
		assertEquals("DesignUI",task.getTask());
		//fail("Not yet implemented");
	}

	@Test
	public void testGetHrs() {
		task.setHrs(5);
		assertEquals(5,task.getHrs());
		//fail("Not yet implemented");
	}

}
