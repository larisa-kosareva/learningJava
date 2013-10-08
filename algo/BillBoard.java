import java.math.BigInteger;

public class BillBoard {
	public static void main(String[] args) {
		BigInteger f2 = new BigInteger("1");
		BigInteger f1 = new BigInteger("5");
		BigInteger f = null;
		int k = 2;
		while (k < 20) {
			f = f1.add(f2);
			if (f.isProbablePrime(10)) {
				k++;
				System.out.println(k + " PRIME NUMBER IS" + f);
			}

			f2 = f1;
			f1 = f;

		}
		System.out.println("10 TH PRIME NUMBER IS" + f);

	}

	//public static boolean isPrime(long f) {

	
}