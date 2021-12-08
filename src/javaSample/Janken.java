package javaSample;

import java.util.Random;

class Player {
	String name;
	String handStatus;
	
	Player(String name) {
		this.name = name;
	}
	
	void makeHandStatus() {
		String[] hands = {"グー", "チョキ", "パー"};
		Random r = new Random();
		this.handStatus = hands[r.nextInt(3)];
	}
}

class Referee {
	String name;
	
	Referee(String name) {
		this.name = name;
	}
	
	void startJanken() {
		System.out.println("じゃんけん・・・ぽん！！！！！");
	}
	
	void chackHand(Player p) {
		System.out.println(p.name + "さんの手：" + p.handStatus);
	}
	
    void judegJunken(Player p1, Player p2) {
    	System.out.println("結果は");
		
		if(p1.handStatus == p2.handStatus) {
			System.out.println("あいこ！勝負つかず！");
			
		} else if(    (p1.handStatus == "グー" && p2.handStatus == "チョキ")
				   || (p1.handStatus == "チョキ" && p2.handStatus == "パー")
				   || (p1.handStatus == "パー" && p2.handStatus == "グー") ) {
			System.out.println(p1.name + "さんの勝利");
			
		} else if(    (p1.handStatus == "グー" && p2.handStatus == "パー")
				   || (p1.handStatus == "チョキ" && p2.handStatus == "グー")
				   || (p1.handStatus == "パー" && p2.handStatus == "チョキ") ) {
			System.out.println(p2.name + "さんの勝利");
		}
	}
}

public class Janken {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Player p1 = new Player("モコ");
		Player p2 = new Player("ポチ");
		Referee ref = new Referee("審判");
		
		ref.startJanken();
		
		p1.makeHandStatus();
		p2.makeHandStatus();
		
		ref.chackHand(p1);
		ref.chackHand(p2);
		
		ref.judegJunken(p1, p2);
	}
}
