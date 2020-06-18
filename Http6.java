package object;

import org.json.JSONArray;
import org.json.JSONObject;

public class Http6 {
	public static void main(String[] args) {
		NetworkUtil nu = new NetworkUtil();
		String result = nu.get("http://ggoreb.com/http/json2.jsp");
		JSONArray obj = new JSONArray(result);
		int len = obj.length();
		for(int i =0; i < len; i++) {
			JSONObject obj2 = obj.getJSONObject(i);
			
			
			int age = obj2.getInt("age");
			String name = obj2.getString("name");
			
			System.out.printf("%d, %s", age, name);
			
		}
		
	}
}