
public class �޼ҵ� {
	static int getTotal(int ��������) {
		int total = 0;
		for (int i = 1; i <= ��������; i++) {
			total += i;
		}
		return total; 
	}          
	static double getAverage(int ��, int ����) {
		return �� / ����;	
	}
	public static void main(String[] args) {
		System.out.println( (long) Math.pow(2, 38));
		int �� = getTotal(100);
		double ��� = getAverage(��, 100);
		System.out.printf("%s, %s", ��, ���);
	}
}
