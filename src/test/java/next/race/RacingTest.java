package next.race;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.After;
import org.junit.Test;

public class RacingTest {

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		new Racing().run(10, Arrays.asList(new Car(), new Car(), new Car()));
	}

}
