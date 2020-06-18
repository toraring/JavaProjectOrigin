package object;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class Http1 {
	public static void main(String[] args) throws IOException {
		URL url = new URL("http://ggoreb.com/pre");
		URLConnection urlConnection = url.openConnection();
		InputStream in = urlConnection.getInputStream();
		InputStreamReader isr = new InputStreamReader(in, "utf-8");
		BufferedReader reader = new BufferedReader(isr);
		StringBuffer response = new StringBuffer();

		String data = null;
		while (true) {
			data = reader.readLine();
			if (data == null)
				break;
			response.append(data + "\n");
		}
		reader.close();
		isr.close();
		in.close();
		System.out.println(response);
	}
}