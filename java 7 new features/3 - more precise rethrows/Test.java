class TrueException extends Exception {}
class FalseException extends Exception {}

public class Test {
	public static void main(String arg[]) throws TrueException, FalseException {

		boolean flag = true;
		try {

			if( flag ) {
				throw new TrueException(); 
			} else {
				throw new FalseException();
			}

		} catch (Exception ex) {
			System.out.println("Exception occured");
			throw ex;
		}

	}
}