import java.util.Scanner;

//�m��3�G���g�{�����n�D�ϥΪ̿�J�@�Ӧ褸���~���A�A�L�X�@�Ӫ����ܩҦ����~�����e���|�~�C�|�~���P�_�аѦ�http://goo.gl/LQmPM8
public class Week2_23 {
  public static void main(String args[]) { 	
	int year = 0, count = 1;
	System.out.println("�п�J�褸�~�G"); 
	Scanner y = new Scanner(System.in);
	year = y.nextInt();
	System.out.println("�|�~���褸�G");
	for(int i=year; i>0; i--)
	{
		if(i%400==0 || (i%4==0 && i%100!=0))
		{
			System.out.print(i+"\t");
			if(count%12==0)
				System.out.print("\n");
			count++;
		}	
	}
  }
}