import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Scanner;

public class ���������� {
	public static void main(String[] args) {
		//�Ұ�ȣ ->�޼ҵ�(method)
		// �ٸ� ����� ���� ��� ��������
		// import => Shift + Ctrl + o(���ĺ�)
		String �˻��� = "";
		�˻���= new Scanner(System.in).nextLine();
		//syso �Է� �� ctrl+ space= ����ϼ�
		System.out.println("1"+2);
		try {
			Desktop.getDesktop().browse(new URI(
					"https://www.youtube.com/results?search_query=" + �˻���));
		} catch (IOException e) {
			e.printStackTrace();
		} catch (URISyntaxException e) {
			e.printStackTrace();

		} // shift+ctrl+f ; �ڵ�����

	}
}
