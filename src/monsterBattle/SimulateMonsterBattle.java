package monsterBattle;

class SimulateMonsterBattle {
	public static void main (String[] args) {
		
		//やせいバトル（BattleWildクラス - mainBattleメソッド）を実行
//		BattleWild battleAtWild = new BattleWild();
//		battleAtWild.mainBattle();
		
		Monster2 a = new Monster2("太郎", "ヒトカゲ", 2);
		System.out.println(a.toString());
	}
}