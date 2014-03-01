import java.io.*; 
import java.util.*;
import java.text.*;
//�m��2�G��@��2.5�`��Shape���O�A�åH������¦�A�]�p�@�����O�ΨӴy�z�T���ΡC�Цb�D�禡�����g�H�U���\��F���ϥΪ̳s��ھڿﶵ��J�����ͪ��Ϊ�(��ΡB���ΡB�x�ΡA�ΤT����)�A�в��͹���������åB�N���̦s�b�}�C���C�̫�A�����L�X�ӡC�L�X�Ӫ��ɭԽЧi�D�ϥΪ̦�����O�ƻ�Ϊ��H���̪����n�S����?
public class Week2_42 {

	public static void main(String[] args) {
		ArrayList<Shape> shapearray = new ArrayList<Shape>();
		Scanner in = new Scanner(System.in);
		int option = 0;
		double a = 0, b = 0;
		Shape shapes[];
		while(true) {
			System.out.print("1)��� 2)��� 3)�x�� 4)�T�� 5)�����æL�X ");
			option = in.nextInt();
			switch(option) {
				case 1 ://���
					System.out.print("�п�J�b�|: ");
					a = in.nextDouble();
					Circle c = new Circle(a);
					shapearray.add(c);
					break;
				case 2 ://����
					System.out.print("�п�J���b�P�u�b: ");
					a = in.nextDouble();
					b = in.nextDouble();
					Oval o = new Oval(a, b);
					shapearray.add(o);
					break;
				case 3 ://�x��
					System.out.print("�п�J���P�e: ");
					a = in.nextDouble();
					b = in.nextDouble();
					Rectangle r = new Rectangle (a, b);
					shapearray.add(r);
					break;
				case 4 ://�T��
					System.out.print("�п�J���P��: ");
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
		System.out.println("��έ��n: " + 3.14 * r * r);
	}  
}

class Oval extends Shape {
	double a = 0.0, b = 0.0;
	public Oval (double a, double b) {
		this.a = a;
		this.b = b;
	}
	public void print() {
		System.out.println("���έ��n: " + 3.14 * a * b);
	} 
}

class Rectangle extends Shape {
	double width = 0.0, height = 0.0;
	public Rectangle(double w, double h) { 
		this.width = w; 
		this.height = h;
	}
	public void print() {
		System.out.println("�x�έ��n: " + width * height);
	}  
}

class Triangle extends Shape {
	double bottom = 0.0, height = 0.0;
	public Triangle (double bottom, double height){
		this.bottom = bottom;
		this.height = height;
	}
	public void print() {
		System.out.println("�T���έ��n: " + bottom * height / 2);
	} 
	
}
