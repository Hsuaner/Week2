import java.io.*; 
import java.util.Scanner;

//�m��2�G�Ѧ�4.2.1.1.3�P4.2.1.2���{���d�ҡA�ϥ�if�Pswitch�ԭz���g�@�ӵ{�����ϥΪ̿�J��ӯB�I�Ʀr�A�бq�|�h�B�⤤��ܤ@���B��l�A���{���|�N�o��ӼƦr�A�ھڹB��l�Ӱ��p��C�Ъ`�N���Ƥ��i��0�A�p�G��0�A�ЦL�X���~�T���C
public class Week2_22 {
  public static void main(String args[])  { 
	double a=0.0, b=0.0;
	int option=0;
	float sum=0.0f;
	try{
		System.out.println("�п�J��ӯB�I�ơG");
		Scanner num = new Scanner(System.in);
		a=num.nextDouble();
		b=num.nextDouble();
		System.out.println("�z��J�G "+a+" �P "+b);
	}catch(Exception e){
		System.out.println("Error:"+e);
	}
	while(true)
	{
		sum=0.0f;
		System.out.print("�п�ܺ�k 1)�[ 2)�� 3)�� 4)�� 5)����");
		Scanner num = new Scanner(System.in);
		option=num.nextInt();
		switch(option){
			case 1 :
				sum=(float)(a+b);
				break;
			case 2 :
				sum=(float)(a-b);
				break;
			case 3 :
				if(a == 0 || b==0)
					System.out.println("�`�M�� 0");
				else
					sum=(float)(a*b);
				break;
			case 4 :
				if(b == 0)
				{
					System.out.println("�������i�� 0");
					sum=0.0f;
					break;
				}
				else
					sum=(float)(a/b);
				break;
			case 5 :
				return;
			default :
				System.out.println("��J���~!!");
				continue;
		}
		if(sum!=0)
			System.out.println("�`�M�� "+sum);
	}
  }
}