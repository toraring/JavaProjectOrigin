package object;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class ���´ٿ�ε� {
	public static void main(String[] args) {
		FileOutputStream fos = null;
		InputStream is = null;
		try {
			// ����� ������ ��ο� ���ϸ�
			fos = new FileOutputStream("c:/dev/10.mp4");
			
			// url ��ġ�� ������ ��������
			URL url = new URL("http://subcontentsdnak.ollehslp.com//0014533/10.mp4");
			URLConnection urlConnection = url.openConnection();
			is = urlConnection.getInputStream();
			byte[] buffer = new byte[1024];
			int readBytes;
			while ((readBytes = is.read(buffer)) != -1) {
				fos.write(buffer, 0, readBytes);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (fos != null) {
					fos.close();
				}
				if (is != null) {
					is.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
