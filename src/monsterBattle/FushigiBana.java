package monsterBattle;

class FushigiBana extends Monster3 {
	FushigiBana() {
		super.setCharacter("FushigiBana");
	}
	
	FushigiBana(String trainer, String name) {
		super(trainer, name);
		super.setCharacter("FushigiBana");
	}
	
	FushigiBana(String trainer, String name, int lv) {
		super(trainer, name, lv);
		super.setCharacter("FushigiBana");
	}
	
	public void levelUp(int upNum) {
		setLv(getLv() + upNum * 1);
		setHpMax(getHpMax() + upNum * 31);
		setAtk(getAtk() + upNum * 6);
		setDef(getDef() + upNum * 7);
		setSpd(getSpd() + upNum * 8);
		setHp(getHpMax());
	}
}
