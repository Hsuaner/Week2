import java.io.*; 
import java.util.*;
import java.text.*;

//�m��2�G�г]�p�@�Ӧ�����������O�A�i�H�~���@��l�ơF�����O���Ѩ禡�i�H�P�_����榡�O�_���T�æL�X��������e�C�t�~�A�м��g�D�禡�ΨӴ��ճo�����O�O�_���T�C
public class Week2_32 {

	public static void main(String[] args) {
		//Date dNOW = new Date();
		//SimpleDateFormat formatter = new SimpleDateFormat("yyyy.MM.dd E");
		//System.out.println("�{�b���: "+formatter.format(dNOW));
		String date;
		TestDate test = new TestDate();
		Scanner in = new Scanner(System.in);
		System.out.print("�п�J����G ");
		date = in.next();
		test.Test(date);
	}

}
class TestDate {
	int[] len = new int[]{0, 31, -1, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	int i = 0, d = 0;
	void Test(String s) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
		try {
             dateFormat.parse(s);
         }
        catch (Exception e) {
        	System.out.println("�榡�����T�I(yyyy/MM/dd)");
        	return;
        }
		String[] ymd = s.split("/");
		int year = Integer.valueOf(ymd[0]);
		int month = Integer.valueOf(ymd[1]);
		int day = Integer.valueOf(ymd[2]);
		if(year > 0 && month > 0 && month <= 12) //�P�_�~�M��
		{
			if(month==2) { //�P�_�|�~
				if(year%400==0 || (year%4==0 && year%100!=0))
				{
					System.out.println("���~���|�~�I(2��29��)");
					d=30;
				}
				else {
					System.out.println("���~�����~�I(2��28��)");
					d=29;
				}
				if(day < d && day > 0)
					print(s);
				else
					System.out.println("������b�X�z�d��I");
				return;
					
			}else if(len[month] > day && day > 0) { //�P�_��
				print(s);
			}else
				System.out.println("������b�X�z�d��I");
				
		}
		else
			System.out.println("������b�X�z�d��I");
		return;
	}
	void print(String s) {
		System.out.print("����b�X�z�d��I\n�z��J��������G "+s);
	}
}
