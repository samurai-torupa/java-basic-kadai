package kadai_028;

import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class Jyanken_Chapter28 {
	public String getMyChoice() {
		try (Scanner myhando = new Scanner(System.in)) {
			String input = "";
			while (true) {
				try  {
					System.out.println("自分のじゃんけんの手を入力しましょう");
					System.out.println("グーはrockのrを入力しましょう");
					System.out.println("チョキはscissorsのsを入力しましょう");
					System.out.println("パーはpaperのpを入力しましょう");
					input = myhando.nextLine();
					if (input == null || input.trim().isEmpty()) {
			            throw new IllegalArgumentException("入力が空です");
			        }
					input = input.trim();
					 if (input.equals("r") || input.equals("s") || input.equals("p")) {
						 return input;
			         } else {
			        	 throw new IllegalArgumentException("無効な入力です");
			         } 
				}catch(IllegalArgumentException e){
					System.out.println("エラー: " + e.getMessage());
			        System.out.println("もう一度入力してください。");
				}catch(Exception e) {
					 System.out.println("予期しないエラーが発生しました。");
					
				}
			}
		}
	}
	public String getRandom() {
	
		String[] hands = {"r", "s", "p"};
        Random rand = new Random();
        int index = rand.nextInt(3);
        return hands[index];
		
	}
	public void playGame(){
		HashMap<String,String> MyHand = new HashMap<String,String>();
		MyHand.put("r","グー");
		MyHand.put("s","チョキ");
		MyHand.put("p","パー");
		
		String myHand = getMyChoice();
        String enemyHand = getRandom();

        System.out.print("あなたの手は " + MyHand.get(myHand));
        System.out.println(",対戦相手の手は " + MyHand.get(enemyHand));
		
        if (myHand.equals(enemyHand)) {
            System.out.println("あいこです");
        } else if (
            (myHand.equals("グー") && enemyHand.equals("チョキ")) ||
            (myHand.equals("チョキ") && enemyHand.equals("パー")) ||
            (myHand.equals("パー") && enemyHand.equals("グー"))
        ) {
            System.out.println("自分の勝ちです");
        } else {
            System.out.println("自分の負けです");
        }
        
	}
	

}
