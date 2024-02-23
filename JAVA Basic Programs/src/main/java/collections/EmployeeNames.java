package collections;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;

public class EmployeeNames {

	public static void main(String[] args) throws IOException {

		var path = Path.of("/home/gvijaykumar/eclipse-workspace/java lang/eclipse-workspace/java lang/src/main/java/oop2/vijay1.txt");
		var lines = Files.readAllLines(path);
		var employee = new HashMap<String, String>();
		for (var line : lines) {
			var part = line.split(",");
			var deptName = part[0];
			var empName = part[1];
			if (employee.containsKey(deptName)) {
				var e = employee.get(deptName);
				employee.put(deptName, e + "," + empName);

			} else {
				employee.put(deptName, empName);
			}

		}
		for (var deptName : employee.keySet()) {
			System.out.println(deptName + " -" + employee.get(deptName));
		}

	}

}