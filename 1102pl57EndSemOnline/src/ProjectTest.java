import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class ProjectTest {
Project project;
Team team;
	@Before
	public void setUp() throws Exception {
		project = new Project("ElectionSystem");
		team=new Team();
		team.setProductOwner(new Member("RSWagh"));
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
	
	@Test
	public void testSetTeam() {
		project.setTeam(team);
		assertEquals("RSWagh",project.getTeam().getProductOwner().getName());
		//fail("Not yet implemented");
	}
	
}
