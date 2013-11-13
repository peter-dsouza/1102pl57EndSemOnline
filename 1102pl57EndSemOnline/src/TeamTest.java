import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class TeamTest {

	Team team;
	
	@Before
	public void setUp() throws Exception {
		team=new Team();
		team.setProductOwner("RSWagh");
		team.setScrumMaster("Krishna");
	}

	@Test
	public void testGetProductOwner() {
		assertEquals("RSWagh",team.getProductOwner());
		//fail("Not yet implemented");
	}

	@Test
	public void testSetProductOwner() {
		team.setProductOwner("Saviana");
		assertEquals("Saviana",team.getProductOwner());
		//fail("Not yet implemented");
	}

	@Test
	public void testGetScrumMaster() {
		assertEquals("Krishna",team.getScrumMaster());
		//fail("Not yet implemented");
	}

	@Test
	public void testSetScrumMaster() {
		team.setScrumMaster("Melanie");
		assertEquals("Melanie",team.getScrumMaster());
		//fail("Not yet implemented");
	}

	@Test
	public void testAddMember() {
		team.addMember("Nadia");
		assertEquals("Nadia",team.getMember(0));
	}

}
