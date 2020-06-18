import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Scanner;

public class 브라우저열기 {
	public static void main(String[] args) {
		//소괄호 ->메소드(method)
		// 다른 사람이 만든 기능 가져오기
		// import => Shift + Ctrl + o(알파벳)
		String 검색어 = "";
		검색어= new Scanner(System.in).nextLine();
		//syso 입력 후 ctrl+ space= 문장완성
		System.out.println("1"+2);
		try {
			Desktop.getDesktop().browse(new URI(
					"https://www.youtube.com/results?search_query=" + 검색어));
		} catch (IOException e) {
			e.printStackTrace();
		} catch (URISyntaxException e) {
			e.printStackTrace();

		} // shift+ctrl+f ; 코드정렬

	}
}
