import java.io.*; 
import java.util.*;
import java.text.*;
//練習2：實作第2.5節的Shape類別，並以此為基礎，設計一個類別用來描述三角形。請在主函式中撰寫以下的功能；讓使用者連續根據選項輸入欲產生的形狀(圓形、橢圓形、矩形，或三角形)，請產生對應的物件並且將它們存在陣列中。最後再全部印出來。印出來的時候請告訴使用者此物件是甚麼形狀？它們的面積又為何?
public class Week2_42 {

	public static void main(String[] args) {
		ArrayList<Shape> shapearray = new ArrayList<Shape>();
		Scanner in = new Scanner(System.in);
		int option = 0;
		double a = 0, b = 0;
		Shape shapes[];
		while(true) {
			System.out.print("1)圓形 2)橢圓 3)矩形 4)三角 5)結束並印出 ");
			option = in.nextInt();
			switch(option) {
				case 1 ://圓形
					System.out.print("請輸入半徑: ");
					a = in.nextDouble();
					Circle c = new Circle(a);
					shapearray.add(c);
					break;
				case 2 ://橢圓形
					System.out.print("請輸入長軸與短軸: ");
					a = in.nextDouble();
					b = in.nextDouble();
					Oval o = new Oval(a, b);
					shapearray.add(o);
					break;
				case 3 ://矩形
					System.out.print("請輸入長與寬: ");
					a = in.nextDouble();
					b = in.nextDouble();
					Rectangle r = new Rectangle (a, b);
					shapearray.add(r);
					break;
				case 4 ://三角
					System.out.print("請輸入底與高: ");
					a = in.nextDouble();
					b = in.nextDouble();
					Triangle t = new Triangle(a, b);
					shapearray.add(t);
					break;
				case 5 :
					for(int i=0;i<shapearray.size();i++)
					{
						shapearray.get(i).print();
					}
					return;
			}
		}

	}
}

abstract class Shape {
	abstract void print();
}

class Circle extends Shape {
	double r = 0.0;
	public Circle(double r) { 
		this.r = r; 
	}
	public void print() {
		System.out.println("圓形面積: " + 3.14 * r * r);
	}  
}

class Oval extends Shape {
	double a = 0.0, b = 0.0;
	public Oval (double a, double b) {
		this.a = a;
		this.b = b;
	}
	public void print() {
		System.out.println("橢圓形面積: " + 3.14 * a * b);
	} 
}

class Rectangle extends Shape {
	double width = 0.0, height = 0.0;
	public Rectangle(double w, double h) { 
		this.width = w; 
		this.height = h;
	}
	public void print() {
		System.out.println("矩形面積: " + width * height);
	}  
}

class Triangle extends Shape {
	double bottom = 0.0, height = 0.0;
	public Triangle (double bottom, double height){
		this.bottom = bottom;
		this.height = height;
	}
	public void print() {
		System.out.println("三角形面積: " + bottom * height / 2);
	} 
	
}
