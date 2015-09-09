package next.race;

import java.util.List;
import java.util.stream.Collectors;

public class Racing {
	private List<Car> go(List<Car> cars) {
		return cars.stream().map(x -> x.move())
				.collect(Collectors.toList());
	}


	public void run(int count, List<Car> cars) {
		if (count == 0 || cars == null) {
			System.out.println("count=0");
			return;
		}
		System.out.println("");
		run(count - 1, go(cars));
	}

}
