package object;

import java.io.IOException;
import java.net.ServerSocket;
import java.util.Random;

public class ����Ŭ���� {
	public static void main(String[] args) throws IOException {
		ServerSocket ss = new ServerSocket(8888);
		ss.accept();
		System.out.println("Ŭ���̾�Ʈ ����!!!!");
		
		// 1. import ���� ��ĥ ��(����Ʈ ��Ʈ, 2. ()�ȿ� ���� �Է�
//		Scanner s = new Scanner(System.in);
//		int input = s.nextInt();
//		System.out.println("�Է°���?" + input);
//		
		//���� ���ֱ�; shift + ctrl + o(���ĺ�)
		Random r = new Random();
		int num = r.nextInt(6);
		System.out.println("��������?" + num);
		
		// �ּ�ó��; �������� ��  ctrl + / �Ǵ� shift + Ctrl +c
//		for(int i = 0; i < s.nextInt(); i++) {
//			
//		}
		 
		
		TV t1 = new TV();
		TV t2 = new TV();
		
		t1.show();
		t2.show();
		
		System.out.println(t1); 
		System.out.println(t2);
		System.out.println(t1 == t2);
	}
}
