import java.io.*;

public class Test {
	public static void main(String arg[]) {

		try(BufferedReader in = new BufferedReader(new FileReader("D:/WORKSPACE/hello.txt"))) {

			String line = null;
			while( (line = in.readLine()) != null ) {
				System.out.println(line);
			}

		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}
}