
public class 최소값 {
	public static void main(String[] args) {
		int[] values = {3, 7, 33, 92, 9};
		int temp = Integer.MAX_VALUE; // int 자료가 가지는 최대값
		
		for(int i = 0; i < values.length; i++) {
			if(temp > values[i] || i == 0 ) {
				temp = values[i];
				
			}
		}
		System.out.println(temp);
	}
}
