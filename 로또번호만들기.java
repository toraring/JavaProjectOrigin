
public class �ζǹ�ȣ����� {
	public static void main(String[] args) {
		int[] lotto = new int[6];
		for(int i = 0; i < lotto.length; i++) {
			int num = (int)(Math.random() * 45 + 1);
			lotto[i] = num; 
		}

		for(int i = 0; i < lotto.length; i++) {
			System.out.println(lotto[i]);
		}
	}
}
