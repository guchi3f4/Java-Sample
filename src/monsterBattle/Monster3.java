package monsterBattle;

import java.math.BigDecimal;
import java.math.RoundingMode;

class Monster3 {
	private String character;
	private String trainer;
	private String name;
	private int lv;
	private int hp;
	private int atk;
	private int def;
	private int spd;
	private int hpMax;
	private String wazaNm;
	private String wazaDmgRate;
	
	Monster3() {
		character = "(unknown)";
		trainer = "(wild)";
		name = "(nonname)";
		lv = 1;
		hp = 80;
		atk = 15;
		def = 10;
		spd = 10;
		hpMax = 80;
		wazaNm = "たいあたり";
		wazaDmgRate = "1.0";
	}
	
	Monster3(String trainer, String name) {
		this();
		this.trainer = trainer;
		this.name = name;
	}
	
	Monster3(String trainer, String name, int lv) {
		this(trainer, name);
		if (lv > 1) {
			//lv == 初期レベル
			levelUp(lv - 1);
		}
	}
	
	public String getCharacter() {
		return character;
	}

	public void setCharacter(String character) {
		this.character = character;
	}

	public String getTrainer() {
		return trainer;
	}

	public void setTrainer(String trainer) {
		this.trainer = trainer;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLv() {
		return lv;
	}

	public void setLv(int lv) {
		this.lv = lv;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getAtk() {
		return atk;
	}

	public void setAtk(int atk) {
		this.atk = atk;
	}

	public int getDef() {
		return def;
	}

	public void setDef(int def) {
		this.def = def;
	}

	public int getSpd() {
		return spd;
	}

	public void setSpd(int spd) {
		this.spd = spd;
	}

	public int getHpMax() {
		return hpMax;
	}

	public void setHpMax(int hpMax) {
		this.hpMax = hpMax;
	}

	public String getWazaNm() {
		return wazaNm;
	}

	public void setWazaNm(String wazaNm) {
		this.wazaNm = wazaNm;
	}

	public String getWazaDmgRate() {
		return wazaDmgRate;
	}

	public void setWazaDmgRate(String wazaDmgRate) {
		this.wazaDmgRate = wazaDmgRate;
	}

	//	レベルアップでステータス上昇
	public void levelUp(int upNum) {
		lv +=  upNum * 1;
		hpMax += upNum * 30;
		atk += upNum * 5;
		def += upNum * 5;
		spd += upNum * 5;
		hp = hpMax;
	}
	
	public void setWaza(String wazaNm, String wazaDmgRate) {
		if (wazaDmgRate.matches("^[0-9]+\\.[0-9]$")) {
			this.wazaNm = wazaNm;
			this.wazaDmgRate = wazaDmgRate;
		} else {
			System.out.println("[ERROR]わざの設定に失敗しました");
		}
	}
	
	//	ステータスの表示
	public String getStatus() {
		return name + "lv(" +  lv + " )" + "HP(" +  hp + "/" + hpMax + " )";
	}
	
	//	わざを使用しダメージを与える
	public int useWaza() {
		 BigDecimal bdAtk = new BigDecimal(atk);
	     BigDecimal bdDmgRate = new BigDecimal(wazaDmgRate);
	     return bdAtk.multiply(bdDmgRate).intValue();
	}
	
	//	受けるダメージを計算
	public int damaged(int dmg) {
		BigDecimal bdDef = new BigDecimal(def);
	    BigDecimal bd1 = new BigDecimal("1");
	    BigDecimal bd120  = new BigDecimal("120");
	    BigDecimal bdDmg = new BigDecimal(dmg);
	    //ダメージ減算率：1 / (1＋ぼうぎょ÷120)  ※小数第３位切り捨て
	    BigDecimal dmgCut = bd1.divide( bd1.add( bdDef.divide(bd120, 2, RoundingMode.DOWN) ), 2, RoundingMode.DOWN );
	    int actualDmg = bdDmg.multiply(dmgCut).intValue();
        //残りhpから実際に受けるダメージを引く
	    if (hp > actualDmg) {
	    	hp -= actualDmg;
	    } else {
	    	hp = 0;
	    }
	    return actualDmg;
	}
	
	public String toString() {
        return   "character：" + character +  "\n"
        	   + "trainer：" + trainer + "\n"
        	   + "name：" + name + "\n"
        	   + "lv：" + lv + "\n"
        	   + "hp：" + hp + "\n"
        	   + "atk：" + atk + "\n"
        	   + "def：" + def + "\n"
        	   + "spd：" + spd + "\n"
        	   + "hpMax：" + hpMax + "\n"
        	   + "wazaNm：" + wazaNm + "\n"
        	   + "wazaDmgRate：" + wazaDmgRate;
    }
}
