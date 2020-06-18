package object;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import org.json.JSONObject;

import object.NetworkUtil;

public class Http9 {
	public static void main(String[] args) throws UnsupportedEncodingException {
		NetworkUtil nu = new NetworkUtil();
		String url = "https://openapi.naver.com/v1/papago/n2mt";
		String param = "source=ko&target=fr&text=";
		param += URLEncoder.encode("�ȳ��ϼ���. ���� �ڹ� �������Դϴ�.", "utf-8");
		String clientId = "OpcnSsAIn37qIu6Iyad6";
		String clientSecret = "p7qtbsYx8N";
		String result = nu.postNaver(url, param, clientId, clientSecret);
		JSONObject obj = new JSONObject(result);
		JSONObject message = obj.getJSONObject("message");
		JSONObject res = message.getJSONObject("result");
		String translatedText = res.getString("translatedText");
		System.out.printf("%s", translatedText);
	}
}