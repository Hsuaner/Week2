//�m��2�G���g�@�ӵ{���A����l�Ƥ@�ӼƦr�}�C�A�b�N���}�C���Ҧ����Ʀr���`�M�P�����p��X�ӡC
public class Week2_12 {
  public static void main(String args[])  { 
	double[] a = {1.0,2.0,3.0,4.0,5.0,6.0,7.0,8.0,9.0,10.0};
	float avg = 0.0f;
	double sum = 0.0;
	System.out.println("�}�C");
	for(double x : a)
	{
		sum+=x;
		System.out.print(x+" ");
	}
	avg=(float)sum/a.length;
	System.out.println("\n�`�M���G"+sum+"\n�������G"+avg);
  }
}