
public class ���ε� {
	public static void main(String[] args) {
		// ���ε��� ������ �� �ֻ��� �ΰ��� ������ ���� ���� ������ Ż���Ѵ�.
		
		//while �ݺ�
		boolean ������ = false;
		while(������ != true) {

			// 1. �ֻ��� �ΰ��� ������.
			// random�� 0.0���� ũ�ų� ���� 1.0���� ���� ���� ���
			double �ֻ���1 = Math.random();
			double �ֻ���2 = Math.random();
			System.out.printf("%s, %s", �ֻ���1, �ֻ���2);
			System.out.println(); //�ٹٲ�
			System.out.printf("%s, %s", (int)(�ֻ���1*6)+1, (int)(�ֻ���2*6)+1);
					 
			// 2. ���� �� ���� �Ǵ��غ���.
			������ =  (int)(�ֻ���1*6)+1 == (int)(�ֻ���2*6)+1;
		}
		
		// 3. ���� ���̸� Ż���Ѵ�. ���� �ݺ��Ϸ��� 1~2�� �ݺ�. Ż���� �ݺ��� �� ����.
		if(������ == true) { // if(������) 
			System.out.println("Ż��!");
		}
		
	}
}
