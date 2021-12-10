package monsterBattle;

import java.math.BigDecimal;
import java.math.RoundingMode;

class Monster2 {
	String character;
	String trainer;
	String name;
	int lv;
	int hp;
	int atk;
	int def;
	int spd;
	int hpMax;
	String wazaNm;
	String wazaDmgRate;
	
	Monster2() {
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
	
	Monster2(String trainer, String name) {
		this();
		this.trainer = trainer;
		this.name = name;
	}
	
	Monster2(String trainer, String name, int lv) {
		this(trainer, name);
		if (lv > 1) {
			//lv == 初期レベル
			levelUp(lv - 1);
		}
	}
	
	//	レベルアップでステータス上昇
	void levelUp(int upNum) {
		lv +=  upNum * 1;
		hpMax += upNum * 30;
		atk += upNum * 5;
		def += upNum * 5;
		spd += upNum * 5;
		hp = hpMax;
	}
	
	void setWaza(String wazaNm, String wazaDmgRate) {
		if (wazaDmgRate.matches("^[0-9]+\\.[0-9]$")) {
			this.wazaNm = wazaNm;
			this.wazaDmgRate = wazaDmgRate;
		} else {
			System.out.println("[ERROR]わざの設定に失敗しました");
		}
	}
	
	//	ステータスの表示
	String getStatus() {
		return name + "lv(" +  lv + " )" + "HP(" +  hp + "/" + hpMax + " )";
	}
	
	//	わざを使用しダメージを与える
	int useWaza() {
		 BigDecimal bdAtk = new BigDecimal(atk);
	     BigDecimal bdDmgRate = new BigDecimal(wazaDmgRate);
	     return bdAtk.multiply(bdDmgRate).intValue();
	}
	
	//	受けるダメージを計算
	int damaged(int dmg) {
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
