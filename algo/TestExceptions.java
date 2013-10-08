public class TestExceptions {
	public static void main(String[] args) {
		String test = "yes";
		try {
			System.out.println("begin try");
			doRisky(test);
			System.out.println("end try");
		} catch (ScaryException se) {
			System.out.println("terrible exception");
		} finally {
			System.out.println("finally");
		}
		System.out.println("end main");

	}

	static void doRisky(String test) throws ScaryException {
		System.out.println("begin dangerous method");
		if ("yes".equals(test)) {
			throw new ScaryException();
		}
		System.out.println("end dangerous method");
		return;
	}
}