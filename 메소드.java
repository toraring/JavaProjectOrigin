
public class 메소드 {
	static int getTotal(int 마지막수) {
		int total = 0;
		for (int i = 1; i <= 마지막수; i++) {
			total += i;
		}
		return total; 
	}          
	static double getAverage(int 합, int 개수) {
		return 합 / 개수;	
	}
	public static void main(String[] args) {
		System.out.println( (long) Math.pow(2, 38));
		int 합 = getTotal(100);
		double 평균 = getAverage(합, 100);
		System.out.printf("%s, %s", 합, 평균);
	}
}
