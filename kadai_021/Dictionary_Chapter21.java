package kadai_021;

import java.util.HashMap;

public class Dictionary_Chapter21 {

	HashMap<String,String> Dictionary = new HashMap<String,String>();
	
		public Dictionary_Chapter21(){
			Dictionary.put("apple","リンゴ");
			Dictionary.put("peach","桃");
			Dictionary.put("banana","バナナ");
			Dictionary.put("lemon","レモン");
			Dictionary.put("pear","梨");
			Dictionary.put("kiwi","キウィ");
			Dictionary.put("strawberry","イチゴ");
			Dictionary.put("grape","ぶどう");
			Dictionary.put("muscat","マスカット");
			Dictionary.put("cherry","さくらんぼ");
		}
		
		public void Serch(String[] furu) {
			for(int i = 0; i < furu.length;i++) {
				if(Dictionary.get(furu[i]) == null) {
					System.out.println(furu[i]+"は辞書に存在しません");
				}else {
					System.out.println(furu[i]+"の意味は"+Dictionary.get(furu[i]));
				}
			}
		}
}
