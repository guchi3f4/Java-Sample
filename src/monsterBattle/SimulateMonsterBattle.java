package monsterBattle;

class SimulateMonsterBattle {
	public static void main (String[] args) {
		
		//やせいバトル（BattleWildクラス - mainBattleメソッド）を実行
//		BattleWild battleAtWild = new BattleWild();
//		battleAtWild.mainBattle();
		
//		Monster3 a = new Monster3("太", "h", 2);
//		Hitokage b = new Hitokage("太郎", "hito", 2);
//		FushigiBana c = new FushigiBana("次郎", "fushi", 2);
		Monster3 a = new Hitokage();
		a.levelUp(1);
		
		System.out.println(a.toString());
//		System.out.println(b.toString());
//		System.out.println(c.toString());
	}
}