public class Test {
	public static void main(String arg[]) {
		
		String str = "aaa";

		switch(str) {
			case "000":
				System.out.println("its 000");
				break;
			case "111":
				System.out.println("its 111");
				break;
			case "aaa":
				System.out.println("its aaa");
				break;
			case "bbb":
				System.out.println("its bbb");
				break;
			default:
				System.out.println("None matches");
		}

	}
}