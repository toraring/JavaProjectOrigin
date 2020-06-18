package object;

import org.json.JSONArray;
import org.json.JSONObject;

public class Http7 {
	public static void main(String[] args) {
		NetworkUtil nu = new NetworkUtil();
		String result = nu.get("http://api.visitkorea.or.kr/openapi/service/rest/KorService/searchFestival?serviceKey=A2usf4txsthrBPXx7%2FckSjISrlOOF3DRCXlpwxFKcl1KPyvOOWSD%2FUhcapvCkM51AdZOieooIvkMdz2XQCt33w%3D%3D&MobileOS=ETC&MobileApp=AppTest&eventStartDate=20");
		JSONObject obj = new JSONObject(result);
		JSONObject response = obj.getJSONObject("response");
		JSONObject body = obj.getJSONObject("body");
		JSONObject items = obj.getJSONObject("items");
		JSONArray item =  items.getJSONArray("item");
		int len = items.length();
		for(int i = 0; i < len; i++) {
			JSONObject it = item.getJSONObject(i);
			String addr1 = it.getString("addr1");
			
			String tel = "";
			
			if(!it.isNull("tel")) {
				tel = it.getString("tel");					
			}
			
			
			String title= it.getString("title");
			System.out.printf("%s %s %s", addr1, tel, title);
			System.out.println();
					
		}
	}
}