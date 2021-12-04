package javaSample;

class Staff {
	String name;
	int staffid;
	String email;
	
	public void sayHello() {
		System.out.println("Hello" + this.name);
	}

	public Staff(String name, int staffid, String email) {
		super();
		this.name = name;
		this.staffid = staffid;
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getStaffid() {
		return staffid;
	}

	public void setStaffid(int staffid) {
		this.staffid = staffid;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}

class RemoteStaff extends Staff {
	public String location;

	public RemoteStaff(String name, int staffid, String email) {
		super(name, staffid, email);
		// TODO 自動生成されたコンストラクター・スタブ
	}
	
}

public class StaffInfo {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Staff yamada = new Staff("Taro Yamada", 12345, "a@a");
		RemoteStaff tanaka = new RemoteStaff("Hnako Tanaka", 22345, "b@b");
		tanaka.location = "大阪";
		
		System.out.println("[社員情報]");
		System.out.println("指名：" + yamada.getName());
		System.out.println("社員番号：" + yamada.getStaffid());
		System.out.println("メールアドレス：" + yamada.getEmail());
		
		System.out.println("[社員情報]");
		System.out.println("指名：" + tanaka.getName());
		System.out.println("社員番号：" + tanaka.getStaffid());
		System.out.println("メールアドレス：" + tanaka.getEmail());
		System.out.println("勤務地：" + tanaka.location);
	}

}
