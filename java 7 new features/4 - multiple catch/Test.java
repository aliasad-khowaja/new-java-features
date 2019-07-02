class Ex1 extends Exception {}
class Ex2 extends Exception {}
class Ex3 extends Exception {}
class Ex4 extends Exception {}

public class Test {
	public static void main(String arg[]) {

		int i = 5;

		try {

			if(i==1) {
				throw new Ex1();
			} else if (i==2) {
				throw new Ex2();
			} else if (i==3) {
				throw new Ex3();
			} else {
				throw new Ex4();
			}

		} catch (Ex1 | Ex2 e) {
			System.out.println("A");
			e.printStackTrace();
		} catch (Ex3 | Ex4 e) {
			System.out.println("B");
			e.printStackTrace();
		}

	}
}