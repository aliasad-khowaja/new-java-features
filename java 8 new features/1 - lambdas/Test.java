public class Test {

	// Funtional Interface
	interface MathOperation {
		int operate(int a, int b);
	}

	public static void main(String arg[]) {

		MathOperation add = (v1, v2) -> v1 + v2;
		MathOperation sub = (v1, v2) -> v1 - v2;

		System.out.println("10 + 5 = " + add.operate(10, 5) );
		System.out.println("10 - 5 = " + sub.operate(10, 5) );

	}

}