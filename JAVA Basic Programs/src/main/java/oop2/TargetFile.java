
	package oop2;

	import java.io.BufferedReader;
	import java.io.BufferedWriter;
	import java.io.FileReader;
	import java.io.FileWriter;
	import java.io.IOException;

	public class TargetFile {

		public static void main(String[] args) throws IOException {

			try {
				BufferedReader reader = new BufferedReader(new FileReader("c:\\desktop\\programmers.txt"));
				BufferedWriter writer = new BufferedWriter(new FileWriter("c:\\desktop\\names.txt"));

				String line;
				while ((line = reader.readLine()) != null) {
					if (line.contains("Vijay"))
						writer.write(line);
				}

				reader.close();
				writer.close();

			} catch (IOException e) {
				e.printStackTrace();
			}

		}

	}
