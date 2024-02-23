package collections;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;



public class AvgPrice {



	public static void main(String[] args) throws IOException {

		var path = Path.of("/home/gvijaykumar/eclipse-workspace/java lang/eclipse-workspace/java lang/src/main/java/oop2/vijay.txt");

		var lines = Files.readAllLines(path);

		int sum = 0, c = 0;

		for (var prices : lines) {

			sum += Integer.parseInt(prices);

			c++;

		}

		int average = sum / c;

		Files.lines(path)

		     .map(Integer::parseInt)

		     .filter(v -> v > average)

		     .forEach(System.out::println);

	}

}