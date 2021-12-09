package javaSample;

import java.util.Random;

class Player {
	private String name;
	private String handStatus;
	
	public Player(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getHand() {
		return handStatus;
	}
	
	public void makeHandStatus() {
		String[] hands = {"グー", "チョキ", "パー"};
		Random r = new Random();
		this.handStatus = hands[r.nextInt(3)];
	}
}

class Referee {
	private String name;
	
	public Referee(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void startJanken() {
		System.out.println("じゃんけん・・・ぽん！！！！！");
	}
	
	public void chackHand(Player p) {
		System.out.println(p.getName() + "さんの手：" + p.getHand());
	}
	
	public void judegJunken(Player p1, Player p2) {
    	System.out.println("結果は");
		
		if(p1.getHand() == p2.getHand()) {
			System.out.println("あいこ！勝負つかず！");
			
		} else if(    (p1.getHand() == "グー" && p2.getHand() == "チョキ")
				   || (p1.getHand() == "チョキ" && p2.getHand() == "パー")
				   || (p1.getHand() == "パー" && p2.getHand() == "グー") ) {
			System.out.println(p1.getName() + "さんの勝利");
			
		} else if(    (p1.getHand() == "グー" && p2.getHand() == "パー")
				   || (p1.getHand() == "チョキ" && p2.getHand() == "グー")
				   || (p1.getHand() == "パー" && p2.getHand() == "チョキ") ) {
			System.out.println(p2.getName() + "さんの勝利");
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
