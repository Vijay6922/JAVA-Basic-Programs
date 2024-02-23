package collections;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class StreamPrices {

	public static void main(String[] args) throws IOException {
		var path = Path.of("/home/gvijaykumar/eclipse-workspace/java lang/eclipse-workspace/java lang/src/main/java/oop2/vijay.txt");

		Files.lines(path)

				.distinct()
				.sorted((a, b) -> b.compareTo(a))
				.limit(3)
				.forEach(System.out::println);

	}

}