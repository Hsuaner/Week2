import java.io.*; 
import java.util.*;

//�m�ߡG���X�RCircle���O�A�b�䤤�[�J�@�Ӧ����禡Arc�PPie�A��Ө禡�������@�ӰѼƥN���סA�ä��O�^�ǸӨ��שҹ����������P���n�C�t�~�A�м��g�D�禡�n�D�ϥΪ̳s���J�b�|�H���ͤ��P����ΡA���ۨϥΪ̥i�H��J�s���P���סA�{���K�|�^�ǸӶ�ι����Ө��ת������P���n�C
public class Week2_31 {
	
	public static void main (String[] args) throws IOException {
		int option = 0, n = 0;
		Scanner a = new Scanner(System.in);
		double r[][] = new double[1][1];
		while(true) {
			System.out.print("1)�s�W 2)�d�� 3)���� ");
			option = a.nextInt();
			switch(option) {
				case 1 :
					System.out.print("�п�J�ƶq�G ");
					n = a.nextInt();
					r = new double[n][2];  // �ʺA�t�m���� 
					/*for(int i = 0; i < n; i++) {
						r[i] = new double[2];
					}*/					
					System.out.println("�п�J�s���P�b�|�G ");
					for(int j = 0; j < n; j++) {
						for(int i = 0; i < 2; i++) {
							r[j][i] = a.nextDouble();
						}
					}
						break;
				case 2 :
					int i = 0;
					double id = 0.0, ang = 0.0;
					Circle c = new Circle();
					System.out.println("�п�J�s���P���סG ");
					id = a.nextDouble();
					ang = a.nextDouble();
					for(i=0; i<n; i++) { //���æL�X
						if(id == r[i][0]) {
							c.radius = r[i][1];
							c.angle = ang;
							System.out.println("\n�s��\t�b�|\t����\t���n ");
							System.out.println(r[i][0]+"\t"+r[i][1]+"\t"+c.Arc()+"\t"+c.Pie()+"\n");
							break;
						}
					}
					if(i == n)
						System.out.println("�䤣����!!");
					break;
				case 3 :
					return;
			}
		}
		
	}

}

class Circle {
	double radius = 0.0, angle = 0.0;

	double Arc() { //����
		return 2 * 3.14 * radius * angle/360;
	}
	double Pie() { //���n
		return 3.14 * radius * radius;
	}
}