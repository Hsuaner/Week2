import java.io.*; 
import java.util.*;
import java.text.*;

//�m��1�G�м��g�@�����O�W��Oval�H�N����A�����O�~�ө�Circle�C�A��ӫ��w�@�~3���m��1�A���g�D�禡���\��C
public class Week2_41 {

	public static void main(String[] args) throws IOException {
			Scanner in = new Scanner(System.in);
			int option = 0, n = 0;
			double r[][] = new double[1][1]; //�s��Ҧ����
			while(true) {
				System.out.print("1)�s�W 2)�d�� 3)���� ");
				option = in.nextInt();
				switch(option) {
					case 1 :
						System.out.print("�п�J�ƶq�G ");
						n = in.nextInt();
						r = new double[n][3];  // �ʺA�t�m���� 
						/*for(int i = 0; i < n; i++) {
							r[i] = new double[2];
						}*/					
						System.out.println("�п�J�s���B���b�P�u�b�G ");
						for(int j = 0; j < n; j++) {
							for(int i = 0; i < 3; i++) {
								r[j][i] = in.nextDouble();
							}
						}
						break;
					case 2 :
						int i = 0;
						double id = 0.0, ang = 0.0;
						Oval c = new Oval();
						System.out.println("�п�J�s���G ");
						id = in.nextDouble();
						for(i=0; i<n; i++) { //���æL�X
							if(id == r[i][0]) {
								c.radius = r[i][1];
								c.b = r[i][2];
								System.out.println("\n�s��\t���b\t�u�b\t���n ");
								System.out.println(r[i][0]+"\t"+r[i][1]+"\t"+r[i][2]+"\t"+c.Pie()+"\n");
								break;
							}
						}
						if(i == n)
							System.out.println("�䤣����!!");
						break;
					case 3 : //����
						return;
				}
			}
	}

}
class Circle {
	double radius = 0.0, angle = 0.0;
	double Arc() { //����
		return 2 * 3.14 * radius * angle / 360;
	}
	double Pie() { //���n
		return 3.14 * radius * radius;
	}
}
class Oval extends Circle{
	double b = 0.0;
	double Pie() { //���n
		return 3.14 * super.radius * b;
	}
}