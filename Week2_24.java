import java.io.*; 
import java.util.*;

//�m��4�G�м��g�@�ӵ{���A�s��n�D�ϥΪ̿�J��ơA�]�A�ǥͩm�W�P�䦨�Z�A��J����ϥΪ̥i�H�i�@�B��J�s���ӧ�X�������ǥ͸�ơF�p�G�ϥΪ̦b��J���Z�ɿ�J���O�X�k���Ʀr�r��A�h�{�������i�H�L�X���~�T���[�Hĵ�i(���ܡGNumberFormatException)�C
public class Week2_24 {
  public static void main(String args[]) throws IOException { 	
	int option = 0, count = 0;
	String[][] Stu = new String[10][3]; //10�C3��
	String[] temp = new String[3];
	String id = "0";
	Scanner a = new Scanner(System.in);
	while(true)
	{
		System.out.println("1)�s�W 2)�d�� 3)����");
		option=a.nextInt();
		switch(option)
		{
			case 1 :
				System.out.println("�п�J�ǥͽs���B�m�W�P���Z�G (�����п�J0 0 0");
				while(true)
				{
					for(int i = 0; i < 3; i++){
						temp[i] = a.next();
					}
					if(temp[0].equals("0")==true && temp[1].equals("0")==true && temp[2].equals("0")==true)
						break;
					else
					{
						for(int i = 0; i < 3; i++){
							Stu[count][i]=temp[i];
						}
						count++;
					}
				}
				break;
			case 2 :
				int i=0;
				System.out.println("�п�J�ǥͽs���G");
				id = a.next();
				for(i=0; i<count; i++)
				{
					if(Stu[i][0].equals(id)==true)
					{
						System.out.println("\n�s��\t�m�W\t���Z");
						System.out.println(Stu[i][0]+"\t"+Stu[i][1]+"\t"+Stu[i][2]+"\n");
						break;
					}
				}
				if(i == count)
					System.out.println("�䤣����!!");
				break;
			case 3 :
				return;
			default :
				continue;
		}
	}
	
  }
}