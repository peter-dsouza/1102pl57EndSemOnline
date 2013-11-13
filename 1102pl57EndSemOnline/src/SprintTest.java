import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class SprintTest {
Sprint sprint1;
Story register;
Task task;

	@Before
	public void setUp() throws Exception {
		sprint1=new Sprint(20);
		register=new Story("Register",7);
		task=new Task();
		task.setTask("DesignUI");
		register.addTask(task);
	}

	@Test
	public void testGetMaxSP() {
		assertEquals(20,sprint1.getMaxSP());
		//fail("Not yet implemented");
	}

	@Test
	public void testGetStory() {
		register.setStoryPoints(7);
		sprint1.addStory(register);
		assertEquals("Register",sprint1.getStory(0).getStory());
		//fail("Not yet implemented");
	}

}
