import java.io.*; 
import java.util.Scanner;

//練習1：要求使用者輸入他的姓名以及西元生日，再將以民國年月日印出他的姓名與生日。
public class Week2_21 {
  public static void main(String args[]) throws IOException { 	
  
	int[] birth = {0,0,0};
	BufferedReader n = new BufferedReader(new InputStreamReader(System.in)); 
	System.out.println("請輸入姓名: "); 
	String name = n.readLine(); 	
	System.out.println("請輸入西元生日：");
	Scanner a = new Scanner(System.in);
	for(int i = 0; i < 3; i++){
		birth[i]=a.nextInt();
	}
	birth[0]=birth[0]-1911;
	System.out.println("哈囉! : " + name); 
	System.out.println("您的生日為 民國" + birth[0] + "年" + birth[1] + "月" + birth[2] + "日");
  }
}