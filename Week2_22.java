import java.io.*; 
import java.util.Scanner;

//練習2：參考4.2.1.1.3與4.2.1.2的程式範例，使用if與switch敘述撰寫一個程式讓使用者輸入兩個浮點數字，請從四則運算中選擇一項運算子，此程式會將這兩個數字，根據運算子來做計算。請注意除數不可為0，如果為0，請印出錯誤訊息。
public class Week2_22 {
  public static void main(String args[])  { 
	double a=0.0, b=0.0;
	int option=0;
	float sum=0.0f;
	try{
		System.out.println("請輸入兩個浮點數：");
		Scanner num = new Scanner(System.in);
		a=num.nextDouble();
		b=num.nextDouble();
		System.out.println("您輸入： "+a+" 與 "+b);
	}catch(Exception e){
		System.out.println("Error:"+e);
	}
	while(true)
	{
		sum=0.0f;
		System.out.print("請選擇算法 1)加 2)減 3)乘 4)除 5)結束");
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
					System.out.println("總和為 0");
				else
					sum=(float)(a*b);
				break;
			case 4 :
				if(b == 0)
				{
					System.out.println("分母不可為 0");
					sum=0.0f;
					break;
				}
				else
					sum=(float)(a/b);
				break;
			case 5 :
				return;
			default :
				System.out.println("輸入錯誤!!");
				continue;
		}
		if(sum!=0)
			System.out.println("總和為 "+sum);
	}
  }
}