import java.io.*; 
import java.util.Scanner;

//�m��1�G�n�D�ϥΪ̿�J�L���m�W�H�Φ褸�ͤ�A�A�N�H����~���L�X�L���m�W�P�ͤ�C
public class Week2_21 {
  public static void main(String args[]) throws IOException { 	
  
	int[] birth = {0,0,0};
	BufferedReader n = new BufferedReader(new InputStreamReader(System.in)); 
	System.out.println("�п�J�m�W: "); 
	String name = n.readLine(); 	
	System.out.println("�п�J�褸�ͤ�G");
	Scanner a = new Scanner(System.in);
	for(int i = 0; i < 3; i++){
		birth[i]=a.nextInt();
	}
	birth[0]=birth[0]-1911;
	System.out.println("���o! : " + name); 
	System.out.println("�z���ͤ鬰 ����" + birth[0] + "�~" + birth[1] + "��" + birth[2] + "��");
  }
}