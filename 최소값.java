
public class �ּҰ� {
	public static void main(String[] args) {
		int[] values = {3, 7, 33, 92, 9};
		int temp = Integer.MAX_VALUE; // int �ڷᰡ ������ �ִ밪
		
		for(int i = 0; i < values.length; i++) {
			if(temp > values[i] || i == 0 ) {
				temp = values[i];
				
			}
		}
		System.out.println(temp);
	}
}
