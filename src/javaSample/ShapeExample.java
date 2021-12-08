package javaSample;

abstract class Shape {
	abstract void draw();
}

interface HasArea {
	double getArea();
}

class Rectangle extends Shape implements HasArea {
	double weight;
	double height;
	
	Rectangle() {
		this.weight = 1;
		this.height = 1;
	}
	
	void draw() {
		System.out.println("□");
	}
	public double getArea() {
		return this.weight * this.height;
	}
}

class Circle extends Shape implements HasArea {
	double r;
	
	Circle() {
		this.r = 1;
	}
	
	void draw() {
		System.out.println("○");
	}
	public double getArea() {
		return this.r * this.r * 3.14;
	}
}
class Polyline extends Shape {
	void draw() {
		System.out.println("W");
	}
}

public class ShapeExample {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Shape[] shapes = new Shape[3];
		shapes[0] = new Rectangle();
		shapes[1] = new Circle();
		shapes[2] = new Polyline();
		
		for(int i = 0; i < shapes.length; i++) {
			shapes[i].draw();
			if(shapes[i] instanceof HasArea) {
				HasArea a = (HasArea)shapes[i];
				System.out.println(a.getArea());
			} else {
				System.out.println("面積は求められない");
			}
		}
	}

}
