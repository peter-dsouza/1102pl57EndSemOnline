import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;


@RunWith(Suite.class)
@SuiteClasses({ ProjectTest.class, SprintTest.class, StoryTest.class,
		TaskTest.class, TeamTest.class })
public class AllTests {

}
