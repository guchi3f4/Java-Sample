package javaSample;

class Computer {
	public String os;
	public int memory;
	public int storage;
}

public class ComputerInfo {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Computer desktop = new Computer();
		desktop.os = "Windows 10";
        desktop.memory = 4;
        desktop.storage = 256;
        
        System.out.println("OS：" + desktop.os);
        System.out.println("Memory：" + desktop.memory);
        System.out.println("Storage：" + desktop.storage);
        
        Computer desktop2 = desktop;
        desktop2.os = "Mac M1";
        
        System.out.println("\nOS：" + desktop2.os);
        System.out.println("Memory：" + desktop2.memory);
        System.out.println("Storage：" + desktop2.storage);
	}

}
