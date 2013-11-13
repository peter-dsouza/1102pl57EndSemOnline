import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class TeamTest {

	Team team;
	
	@Before
	public void setUp() throws Exception {
		team=new Team();
		team.setProductOwner(new Member("RSWagh"));
		team.setScrumMaster(new Member("Krishna"));
	}

	@Test
	public void testGetProductOwner() {
		assertEquals("RSWagh",team.getProductOwner().getName());
		//fail("Not yet implemented");
	}

	@Test
	public void testSetProductOwner() {
		team.setProductOwner(new Member("Saviana"));
		assertEquals("Saviana",team.getProductOwner().getName());
		//fail("Not yet implemented");
	}

	@Test
	public void testGetScrumMaster() {
		assertEquals("Krishna",team.getScrumMaster().getName());
		//fail("Not yet implemented");
	}

	@Test
	public void testSetScrumMaster() {
		team.setScrumMaster(new Member("Melanie"));
		assertEquals("Melanie",team.getScrumMaster().getName());
		//fail("Not yet implemented");
	}

	@Test
	public void testAddMember() {
		team.addMember(new Member("Nadia"));
		assertEquals("Nadia",team.getMember(0).getName());
	}

}
