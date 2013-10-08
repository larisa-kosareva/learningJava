public class SuperArrayTest {
	public static void main(String[] args) {
		SuperArray su = new SuperArray();
		su.add(10);
		su.add(1);
		su.add(7);
		
		su.add(12);
		su.add(9);
		su.add(6);
		su.add(14);
		su.add(13);
		su.add(4);
		su.add(1);		
		su.add(2);
		int si = su.size();
		int ten = su.get(10);
		System.out.println("sizeS =" + si);
		System.out.println("ten = " + ten);

	}
}