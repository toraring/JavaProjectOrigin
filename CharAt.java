package object;

public class CharAt {
	public static void main(String[] args) {
		System.out.println((long) Math.pow(2, 38));
		String str = "Java Secure Coding";
		int len = str.length();
		for (int i = 0; i < len; i++) {
			char c = str.charAt(i);
			System.out.println(c);
		}
	}
}
//���� ����; ���� ���� �� ctrl shift f