package next.race;

import java.util.Arrays;

import org.junit.After;
import org.junit.Test;

public class RacingTest {

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		new Racing().run(2, Arrays.asList(0, 0, 0, 0, 0, 0, 0));
	}

}
