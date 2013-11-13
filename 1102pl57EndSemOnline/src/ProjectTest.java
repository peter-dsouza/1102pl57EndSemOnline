import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class ProjectTest {
Project project;
	@Before
	public void setUp() throws Exception {
		project = new Project("ElectionSystem");
	}

	@Test
	public void testGetProjectName() {
		assertEquals("ElectionSystem",project.getProjectName());
		//fail("Not yet implemented");
	}

	@Test
	public void testSetProjectName() {
		project.setProjectName("NewElectionSystem");
		assertEquals("NewElectionSystem",project.getProjectName());
		//fail("Not yet implemented");
	}
	

}
