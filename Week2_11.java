//�m��1�G���g�@�ӵ{���N4�I23��45���13�I54��23�������`��ƿ�X�C
public class Week2_11 {
  public static void main(String args[])  { 
	int[] a = {4,23,45};
	int[] b = {13,54,23};
	int[] c = {0,0,0};
	int sum = 0;
	for(int i=a.length-1; i>=0; i--)
	{
		if(b[i] < a[i] && i-1>=0)
		{
			b[i-1]-=1;
			c[i]=60-a[i]+b[i];
		}
		else
		{
			c[i]=b[i]-a[i];
		}
	}
	sum=c[2]+c[1]*60+c[0]*3600;
	System.out.println("4�I23��45���13�I54��23�� \n�g�L�F"+c[0]+"��"+c[1]+"��"+c[2]+"��");
  	System.out.println("�������`��Ƭ��G"+sum);
	
  }
}