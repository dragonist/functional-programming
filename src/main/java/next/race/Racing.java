package next.race;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Racing {

	private Random r = new Random();

	public void run(int count, List<Integer> cars) {
		if (count == 0 || cars == null) {
			System.out.println("done");
			return;
		}
		System.out.println("round start");

		run(count - 1, go(cars));
	}

	private List<Integer> go(List<Integer> cars) {
		List<Integer> maps = cars.stream().map(x -> r.nextInt(10) > 4 ? x + 1 : x).collect(Collectors.toList());
		maps.forEach(x -> System.out.println(com.google.common.base.Strings.repeat("-", x)));
		return maps;

	}
}
