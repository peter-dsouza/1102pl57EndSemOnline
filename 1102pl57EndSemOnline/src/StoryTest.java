import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class StoryTest {
Story story;
Task task;

	@Before
	public void setUp() throws Exception {
		story=new Story("Register");
		task=new Task();
	}

	@Test
	public void testGetStory() {
		assertEquals("Register",story.getStory());
		//fail("Not yet implemented");
	}

	@Test
	public void testGetStoryPoints() {
		story.setStoryPoints(7);
		assertEquals(7,story.getStoryPoints());
		//fail("Not yet implemented");
	}

	@Test
	public void testGetPriority() {
		story.setPriority(2);
		assertEquals(2,story.getPriority());
		//fail("Not yet implemented");
	}

	@Test
	public void testAddTask() {
		task.setTask("DesignUI");
		story.addTask(task);
		assertEquals("DesignUI",story.getTask(0).getTask());
		//fail("Not yet implemented");
	}

}
