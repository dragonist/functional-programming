package next;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import ch.qos.logback.core.net.SyslogOutputStream;

public class StreamStudy {

	public static long countWords() throws IOException {
		String contents = new String(Files.readAllBytes(Paths.get("src/main/resources/war-and-peace.txt")),
				StandardCharsets.UTF_8);
		List<String> words = Arrays.asList(contents.split("[\\P{L}]+"));

		long count = 0;
		for (String w : words) {
			if (w.length() > 12)
				count++;
		}
		return count;
	}

	public static void printLongestWordTop100() throws IOException {
		String contents = new String(Files.readAllBytes(Paths.get("src/main/resources/war-and-peace.txt")),
				StandardCharsets.UTF_8);
		List<String> words = Arrays.asList(contents.split("[\\P{L}]+"));
		words = words.stream().filter(x -> x.length() > 12).map(x -> x.toLowerCase()).distinct().sorted((x,y)-> y.length() - x.length()).limit(100)
				.collect(Collectors.toList());

		words.forEach(System.out::println);
		// TODO 이 부분에 구현한다.
	}

	public static List<Integer> doubleNumbers(List<Integer> numbers) {
		return numbers.stream().map(x -> 2 * x).collect(Collectors.toList());
	}

	public static long sumAll(List<Integer> numbers) {
		return numbers.stream().reduce(0, (x, y) -> x + y);
	}

	public static long sumOverThreeAndDouble(List<Integer> numbers) {
		return numbers.stream().filter(x -> (x > 3)).map(x -> 2 * x).reduce(0, (x, y) -> x + y);
	}
}
