package monsterBattle;

class Hitokage extends Monster3 {
	Hitokage() {
		super.setCharacter("Hitokage");
	}
	
	Hitokage(String trainer, String name) {
		super(trainer, name);
		super.setCharacter("Hitokage");
	}
	
	Hitokage(String trainer, String name, int lv) {
		super(trainer, name, lv);
		super.setCharacter("Hitokage");
	}
	
	public void levelUp(int upNum) {
		setLv(getLv() + upNum * 1);
		setHpMax(getHpMax() + upNum * 29);
		setAtk(getAtk() + upNum * 8);
		setDef(getDef() + upNum * 5);
		setSpd(getSpd() + upNum * 9);
		setHp(getHpMax());
	}
}
